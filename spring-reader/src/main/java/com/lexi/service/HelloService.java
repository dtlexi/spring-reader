package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
	public HelloService(HelloServiceByXml helloServiceByXml)
	{

	}

	public void sayHello()
	{
		System.out.println("Hello Spring");
	}
}
