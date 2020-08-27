package com.lexi;

import com.lexi.config.SpringConfig;
import com.lexi.service.*;
import com.lexi.service.supplier.HelloServiceBySupplier;
import com.lexi.service.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Reader {
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloService helloService=context.getBean(HelloService.class);

//		System.out.println(context.getBean(HelloServiceCreateByAnnoBean.class));

//		System.out.println(context.getBean(HelloServiceBySupplier.class));
		System.out.println(context.getBean(SupplierService.class));
	}
}

