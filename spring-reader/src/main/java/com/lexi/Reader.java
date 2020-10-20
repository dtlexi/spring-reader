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

		HelloService helloService= (HelloService) context.getBean("helloService");
		helloService.toString();

		System.out.println(helloServiceAutowired1);
	}
}

