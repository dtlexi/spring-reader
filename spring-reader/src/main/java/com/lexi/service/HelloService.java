package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class HelloService {
	@Autowired
	List<IHelloServiceAutowired> helloServiceAutowired;

//	@Resource
//	HelloServiceCreateByAnnoBean helloServiceCreateByAnnoBean;

	public HelloService()
	{

	}

	public void sayHello()
	{
		System.out.println("Hello Spring");
	}
}
