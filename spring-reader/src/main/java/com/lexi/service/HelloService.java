package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloService implements IHelloService {
	@Autowired
	List<IHelloServiceAutowired> helloServiceAutowired;

	@Autowired
	HelloServiceAutowiredLazy helloServiceAutowiredLazy;
//	@Resource
//	HelloServiceCreateByAnnoBean helloServiceCreateByAnnoBean;

//	@Lookup
//	public HelloServiceAutowired2 getHelloServiceAutowired2(){
//		return null;
//	};

	public void sayHello()
	{
//		System.out.println("Hello Spring");
		System.out.println(this.helloServiceAutowired);
		System.out.println(this.helloServiceAutowiredLazy);
	}

//	public void test()
//	{
//		this.helloServiceAutowiredLazy.say();
//	}
}
