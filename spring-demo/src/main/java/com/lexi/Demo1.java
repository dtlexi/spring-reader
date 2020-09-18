package com.lexi;

import com.lexi.factory.BeanFactory;
import com.lexi.service.A;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		BeanFactory beanFactory=new BeanFactory();
		System.out.println(beanFactory.getBean(A.class));
		System.out.println(beanFactory.getBean(A.class));
	}
}
