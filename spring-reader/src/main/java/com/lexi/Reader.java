package com.lexi;

import com.lexi.config.SpringConfig;
import com.lexi.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Reader {
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
//		System.out.println(context.getBean("helloServiceFactoryBean"));
//		System.out.println(context.getBean("helloServiceFactoryBean"));
//		System.out.println(context.getBean("helloServiceFactoryBean"));
//		System.out.println(context.getBean("helloServiceFactoryBean"));
//		System.out.println(context.getBean("&helloServiceFactoryBean"));

		context.getBean(HelloServiceByXml.class);
	}
}
