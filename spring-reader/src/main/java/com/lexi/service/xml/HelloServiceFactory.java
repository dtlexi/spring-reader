package com.lexi.service.xml;

import com.lexi.service.HelloService;
import com.lexi.service.IHelloService;

public class HelloServiceFactory {
	public HelloServiceCreateByFactory createHelloServiceCreateByFactory()
	{
		return new HelloServiceCreateByFactory();
	}

	public HelloServiceCreateByFactory createHelloServiceCreateByFactory(HelloServiceFactory helloServiceFactory)
	{
		return new HelloServiceCreateByFactory();
	}

	public HelloServiceCreateByFactory createHelloServiceCreateByFactory(HelloServiceFactory helloServiceFactory, IHelloService helloService,int age)
	{
		return new HelloServiceCreateByFactory();
	}

	public void sayHello()
	{
		System.out.println("hello spring");
	}
}
