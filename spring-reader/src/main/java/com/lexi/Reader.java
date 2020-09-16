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
//		HelloServiceWithLookupByXml helloServiceWithLookupByXml= (HelloServiceWithLookupByXml) context.getBean("helloServiceWithLookupByXml");
//
//		System.out.println(helloServiceWithLookupByXml.getHelloServiceAutowired1());
//		System.out.println(helloServiceWithLookupByXml.getHelloServiceAutowired1(context.getBean(HelloService.class)));
//
//		System.out.println(context.getBean(SupplierService.class));

		System.out.println(context.getBean("helloServiceByParent"));
		System.out.println(context.getBean("helloServiceByParent"));
		System.out.println(context.getBean("helloServiceByParent"));
	}
}

