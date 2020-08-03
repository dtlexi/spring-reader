package com.lexi;

import com.lexi.config.SpringConfig;
import com.lexi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Reader {
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
//		System.out.println(context.getBean("helloServiceFactoryBean"));
//		System.out.println(context.getBean("helloServiceFactoryBean"));
//		System.out.println(context.getBean("helloServiceFactoryBean"));
//		System.out.println(context.getBean("helloServiceFactoryBean"));
//		System.out.println(context.getBean("&helloServiceFactoryBean"));

		HelloService helloService1= context.getBean(HelloService.class);
		helloService1.sayHello();

	}
}

