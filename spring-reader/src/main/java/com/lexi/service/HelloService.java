package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class HelloService {
	@Autowired
	List<IHelloServiceAutowired> helloServiceAutowired;

	@Autowired
	HelloServiceAutowiredLazy helloServiceAutowiredLazy;
//	@Resource
//	HelloServiceCreateByAnnoBean helloServiceCreateByAnnoBean;

	public HelloService()
	{

	}

	public void sayHello()
	{
		System.out.println("Hello Spring");
	}

	public void test()
	{
		this.helloServiceAutowiredLazy.say();
	}
}
