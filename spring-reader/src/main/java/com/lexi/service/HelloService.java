package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloService implements IHelloService {
//	@Autowired
//	List<IHelloServiceAutowired> helloServiceAutowired;
//
//	@Autowired
//	CircularReference1 circularReference1;
//
//	@Autowired
//	HelloServiceAutowiredLazy helloServiceAutowiredLazy;
	@Value("lexi")
	String name;

	@Value("#{18}")
	int age;

	@Value("180")
	int height;

	@Autowired
	@Lazy
	public HelloServiceAutowired1 helloServiceAutowired1;
//	@Resource
//	HelloServiceCreateByAnnoBean helloServiceCreateByAnnoBean;

//	@Lookup
//	public HelloServiceAutowired2 getHelloServiceAutowired2(){
//		return null;
//	};

	public void sayHello()
	{
		System.out.println(this.helloServiceAutowired1);
////		System.out.println("Hello Spring");
//		System.out.println(this.helloServiceAutowired);
//		System.out.println(this.helloServiceAutowiredLazy);
	}

//	public void test()
//	{
//		this.helloServiceAutowiredLazy.say();
//	}
}
