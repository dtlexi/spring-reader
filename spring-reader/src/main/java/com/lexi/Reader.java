package com.lexi;

import com.lexi.applicationEvent.service.OrderService;
import com.lexi.config.SpringConfig;
import com.lexi.edit.TestPropertyEditor;
import com.lexi.importDemo.Test4;
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
		System.out.println(context.getBean(Test4.class));
	}

//	public static void main(String[] args) {
//		SimpleTypeConverter simpleTypeConverter=new SimpleTypeConverter();
//		//simpleTypeConverter.registerCustomEditor(Integer.class,new TestPropertyEditor());
//		//simpleTypeConverter.registerCustomEditor(int.class,new TestPropertyEditor());
//		simpleTypeConverter.setConversionService(new DefaultConversionService());
//		System.out.println(simpleTypeConverter.convertIfNecessary("1",int.class));
//	}

//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
//		OrderService orderService=context.getBean(OrderService.class);
//		orderService.order(10);
//	}

}

