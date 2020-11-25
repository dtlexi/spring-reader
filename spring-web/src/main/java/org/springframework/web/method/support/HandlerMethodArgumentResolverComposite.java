/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.method.support;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Resolves method parameters by delegating to a list of registered
 * {@link HandlerMethodArgumentResolver HandlerMethodArgumentResolvers}.
 * Previously resolved method parameters are cached for faster lookups.
 *
 * @author Rossen Stoyanchev
 * @author Juergen Hoeller
 * @since 3.1
 */
public class HandlerMethodArgumentResolverComposite implements HandlerMethodArgumentResolver {

	private final List<HandlerMethodArgumentResolver> argumentResolvers = new LinkedList<>();

	private final Map<MethodParameter, HandlerMethodArgumentResolver> argumentResolverCache =
			new ConcurrentHashMap<>(256);


	/**
	 * Add the given {@link HandlerMethodArgumentResolver}.
	 */
	public HandlerMethodArgumentResolverComposite addResolver(HandlerMethodArgumentResolver resolver) {
		this.argumentResolvers.add(resolver);
		return this;
	}

	/**
	 * Add the given {@link HandlerMethodArgumentResolver HandlerMethodArgumentResolvers}.
	 * @since 4.3
	 */
	public HandlerMethodArgumentResolverComposite addResolvers(
			@Nullable HandlerMethodArgumentResolver... resolvers) {

		if (resolvers != null) {
			Collections.addAll(this.argumentResolvers, resolvers);
		}
		return this;
	}

	/**
	 * Add the given {@link HandlerMethodArgumentResolver HandlerMethodArgumentResolvers}.
	 */
	public HandlerMethodArgumentResolverComposite addResolvers(
			@Nullable List<? extends HandlerMethodArgumentResolver> resolvers) {

		if (resolvers != null) {
			this.argumentResolvers.addAll(resolvers);
		}
		return this;
	}

	/**
	 * Return a read-only list with the contained resolvers, or an empty list.
	 */
	public List<HandlerMethodArgumentResolver> getResolvers() {
		return Collections.unmodifiableList(this.argumentResolvers);
	}

	/**
	 * Clear the list of configured resolvers.
	 * @since 4.3
	 */
	public void clear() {
		this.argumentResolvers.clear();
	}


	/**
	 * Whether the given {@linkplain MethodParameter method parameter} is
	 * supported by any registered {@link HandlerMethodArgumentResolver}.
	 */
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return getArgumentResolver(parameter) != null;
	}

	/**
	 * Iterate over registered
	 * {@link HandlerMethodArgumentResolver HandlerMethodArgumentResolvers}
	 * and invoke the one that supports it.
	 * @throws IllegalArgumentException if no suitable argument resolver is found
	 */
	@Override
	@Nullable
	public Object resolveArgument(MethodParameter parameter, @Nullable ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, @Nullable WebDataBinderFactory binderFactory) throws Exception {

		/**
		 * 获取ArgumentResolver,用来解析参数
		 * Spring 提供了20多个ArgumentResolver，当然我们也可以自己实现ArgumentResolver，添加到容器中去
		 * 当然这样有个问题，可能我提供的ArgumentResolver在Spring 提供的ArgumentResolver后面，导致被Spring提供的ArgumentResolver执行
		 * 此时可以使用@Autowired注解解决问题
		 *
		 * 这边比较常用的ArgumentResolver如下
		 * 	1. RequestParamMethodArgumentResolver
		 * 		tips:
		 * 			this.argumentResolvers容器中有俩个RequestParamMethodArgumentResolver的解析器
		 * 			1. index=0:第一个index=0，即第一个，此时useDefaultResolution==false，表示不解析没有添加@RequestParam注解普通类型参数
		 * 			2. index=-2：即倒数第二个，此时useDefaultResolution==true，表示解析没有添加没有添加@RequestParam注解普通类型参数
		 *
		 *		support:
		 *			1. 添加了@RequestParam的非Map类型参数
		 *			2. 添加了@RequestParam的Map，并且此时指定了@RequestParam的name属性
		 *			3. 没有添加@RequestParam注解的普通类型的参数（此时 this.useDefaultResolution==true）（int,Integer,Float,float,String...）
		 *
		 * 		resolve idea:
		 * 			1. 获取@RequireParams的name
		 * 			2. request.getParameterValues(name);获取参数的值
		 * 			3. 通过TypeConverter转换成对应的类型
		 *
		 *
		 * 	2. RequestParamMapMethodArgumentResolver
		 * 		support:
		 * 			1. 加了@RequestParam的map参数，并且没有指定name
		 *
		 *		resolve idea:
		 *			1. 将request的参数封装成一个map
		 *			2. 初始化一个全新的map
		 *			3. 将requestMap中的k-v添加到新map中去
		 *
		 *
		 * 	3. PathVariableMethodArgumentResolver
		 * 		support:
		 * 			1. 添加了@PathVariable的非Map类型参数
		 * 			2. 添加了@PathVariable的Map，并且此时指定了@RPathVariable的name属性
		 *
		 * 		resolve idea:
		 * 			1. 获取@RequireParams的name
		 * 			2. request.getParameterValues(name);获取参数的值
		 * 			3. 通过TypeConverter转换成对应的类型
		 *
		 * 	4. PathVariableMapMethodArgumentResolver
		 * 	5. ModelAttributeMethodProcessor
		 * 		Tips:
		 * 			this.argumentResolvers容器中有俩个ModelAttributeMethodProcessor的解析器,
		 * 			1. index=6,此时annotationNotRequired属性为false，表示不解析其他非常规参数
		 * 			2. index=-1.表示最后一个，	此时annotationNotRequired属性为true，表示解析其他非常规参数
		 *
		 * 		support:
		 * 			1. 添加了@ModelAttribute注解的参数
		 * 			2. 非简单参数（不是int,Integer,float...并且不是这些类型的数组）（this.annotationNotRequired==true）
		 *
		 * 	6. RequestResponseBodyMethodProcessor
		 * 	7. MapMethodProcessor
		 */


		// 这边一般默认使用
		// this.argumentResolvers有2个RequestParamMethodArgumentResolver，
		// 		其中第一个useDefaultResolution==false，表是当前值匹配加了@RequestParam注解的参数
		//		另外一个useDefaultResolution==true，表示当前匹配基本数据类型的参数
		HandlerMethodArgumentResolver resolver = getArgumentResolver(parameter);
		if (resolver == null) {
			throw new IllegalArgumentException("Unsupported parameter type [" +
					parameter.getParameterType().getName() + "]. supportsParameter should be called first.");
		}
		// 获取参数
		return resolver.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
	}

	/**
	 * Find a registered {@link HandlerMethodArgumentResolver} that supports
	 * the given method parameter.
	 */
	@Nullable
	private HandlerMethodArgumentResolver getArgumentResolver(MethodParameter parameter) {
		HandlerMethodArgumentResolver result = this.argumentResolverCache.get(parameter);
		if (result == null) {
			// this.argumentResolvers有2个RequestParamMethodArgumentResolver，
			// 		其中第一个useDefaultResolution==false，表是当前值匹配加了@RequestParam注解的参数
			//		另外一个useDefaultResolution==true，表示当前匹配基本数据类型的参数



			// <img src="https://res-by-lexi.oss-cn-shanghai.aliyuncs.com/1606286127280.png"  />
			for (HandlerMethodArgumentResolver resolver : this.argumentResolvers) {
				if (resolver.supportsParameter(parameter)) {
					result = resolver;
					this.argumentResolverCache.put(parameter, result);
					break;
				}
			}
		}
		return result;
	}

}
