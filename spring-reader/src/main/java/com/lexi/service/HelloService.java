package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Component
public class HelloService {
	@Autowired
	List<IHelloServiceAutowired> helloServiceAutowired;

	@Autowired
	HelloServiceAutowiredLazy helloServiceAutowiredLazy;
//	@Resource
//	HelloServiceCreateByAnnoBean helloServiceCreateByAnnoBean;

	@Lookup
	public HelloServiceAutowired2 getHelloServiceAutowired2(){
		return null;
	};

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
