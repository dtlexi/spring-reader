package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class HelloService {
	@Autowired
	HelloServiceByXml helloServiceByXml;

	@Resource
	HelloServiceCreateByAnnoBean helloServiceCreateByAnnoBean;

	public HelloService()
	{

	}

	public void sayHello()
	{
		System.out.println("Hello Spring");
	}
}
