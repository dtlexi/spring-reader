package com.lexi;

import com.lexi.config.SpringConfig;
import com.lexi.edit.TestPropertyEditor;
import com.lexi.properties.Postman;
import com.lexi.service.autowire.HelloServiceAutowireByType;
import com.lexi.service.conditional.ConditionalB;
import com.lexi.service.factory.FactoryBeanObject;
import com.lexi.service.factory.TestFactoryBean;
import com.lexi.service.jdkDynamicAopService.IJdkDynamicAopService;
import com.lexi.service.*;
import com.lexi.service.scope.HelloServicePrototype;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.validation.DataBinder;

import java.util.ArrayList;
import java.util.List;

public class Reader {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

//		HelloServiceAutowired1 helloServiceAutowired1=context.getBean(HelloServiceAutowired1.class);

		HelloService helloService= (HelloService)context.getBean("helloService");

		helloService.test();

		IJdkDynamicAopService jdkDynamicAopService=context.getBean(IJdkDynamicAopService.class);
		jdkDynamicAopService.say();

		System.out.println(context.getBean(Postman.class));
		System.out.println(jdkDynamicAopService);

		SpringConfig config=context.getBean(SpringConfig.class);
		config.createHelloServiceCreateByAnnoBean();

		context.getBean(HelloServiceAutowireByType.class);
		config.test();

		TestFactoryBean testFactoryBean= context.getBean(TestFactoryBean.class);
		FactoryBeanObject factoryBeanObject1= context.getBean(FactoryBeanObject.class);

		System.out.println(factoryBeanObject1);

		IHelloServiceAutowired helloServiceAutowired=context.getBean(IHelloServiceAutowired.class);

		HelloServicePrototype helloServicePrototype=context.getBean(HelloServicePrototype.class);

		ConditionalB conditionalB=context.getBean(ConditionalB.class);
		System.out.println(conditionalB);
	}

//	public static void main(String[] args) {
//		SimpleTypeConverter simpleTypeConverter=new SimpleTypeConverter();
//		//simpleTypeConverter.registerCustomEditor(Integer.class,new TestPropertyEditor());
//		//simpleTypeConverter.registerCustomEditor(int.class,new TestPropertyEditor());
//		simpleTypeConverter.setConversionService(new DefaultConversionService());
//		System.out.println(simpleTypeConverter.convertIfNecessary("1",int.class));
//	}


}

