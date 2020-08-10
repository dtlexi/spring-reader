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

		HelloServiceByXml helloService1= context.getBean(HelloServiceByXml.class);
//		helloService1.sayHello();

		System.out.println(helloService1.getHelloServiceAutowired2());

		HelloServiceByXml helloService2= context.getBean(HelloServiceByXml.class);
		System.out.println(helloService2.getHelloServiceAutowired2());
	}
}

