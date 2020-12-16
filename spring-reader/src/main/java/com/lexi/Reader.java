package com.lexi;

import com.lexi.config.SpringConfig;
import com.lexi.properties.Postman;
import com.lexi.service.jdkDynamicAopService.IJdkDynamicAopService;
import com.lexi.service.*;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.validation.DataBinder;

public class Reader {
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);


//		HelloServiceAutowired1 helloServiceAutowired1=context.getBean(HelloServiceAutowired1.class);

		HelloService helloService= (HelloService) context.getBean("helloService");
		helloService.test();

		IJdkDynamicAopService jdkDynamicAopService=context.getBean(IJdkDynamicAopService.class);
		jdkDynamicAopService.say();

		System.out.println(context.getBean(Postman.class));
		System.out.println(jdkDynamicAopService);
	}
}

