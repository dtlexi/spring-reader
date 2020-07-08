package com.lexi;

import com.lexi.config.SpringConfig;
import com.lexi.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Reader {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		context.getBean(HelloService.class).sayHello();
	}
}
