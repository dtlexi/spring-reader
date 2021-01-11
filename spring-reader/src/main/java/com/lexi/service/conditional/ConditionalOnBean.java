package com.lexi.service.conditional;

import org.springframework.asm.Type;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class ConditionalOnBean implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Map<String,Object> attrs= metadata.getAnnotationAttributes(com.lexi.service.conditional.anno.ConditionalOnBean.class.getName());
//		if(context.getBeanFactory().containsBean(""))

		Class<? extends Object> type= (Class<? extends Object>) attrs.get("value");
		String[] beanNames= context.getBeanFactory().getBeanNamesForType(type);

		if(beanNames!=null && beanNames.length>0)
		{
			String beanName=beanNames[0];
			if(context.getBeanFactory().getBeanNamesForType(type)!=null)
			{
				return true;
			}
		}



		return  false;
	}
}
