package com.lexi;

import com.lexi.config.SpringConfig;
import com.lexi.service.*;
import com.lexi.service.supplier.HelloServiceBySupplier;
import com.lexi.service.supplier.SupplierService;
import com.lexi.service.xml.HelloServiceWithLookupByXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Reader {
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

		HelloServiceAutowired1 helloServiceAutowired1=context.getBean(HelloServiceAutowired1.class);
		CircularReference1 circularReference1=context.getBean(CircularReference1.class);
		HelloService helloService=context.getBean(HelloService.class);

//		CircularReference1 circularReference1=context.getBean(CircularReference1.class);
//		circularReference1.say();
		System.out.println(circularReference1.circularReference2);

		System.out.println(context.getBean(SupplierService.class));

		System.out.println(context.getBean("helloServiceByParent"));
		System.out.println(context.getBean("helloServiceByParent"));
		System.out.println(context.getBean("helloServiceByParent"));
	}
}

