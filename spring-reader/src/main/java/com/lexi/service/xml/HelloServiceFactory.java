package com.lexi.service.xml;

import com.lexi.service.HelloService;
import com.lexi.service.IHelloService;

public class HelloServiceFactory {
	public HelloServiceCreateByFactory createHelloServiceCreateByFactory()
	{
		System.out.println(1);
		return new HelloServiceCreateByFactory();
	}

	public HelloServiceCreateByFactory createHelloServiceCreateByFactory(HelloServiceFactory helloServiceFactory)
	{
		System.out.println(2);
		return new HelloServiceCreateByFactory();
	}

	public HelloServiceCreateByFactory createHelloServiceCreateByFactory(HelloServiceFactory helloServiceFactory, IHelloService helloService,int age)
	{
		System.out.println(3);
		return new HelloServiceCreateByFactory();
	}

	public void sayHello()
	{
		System.out.println("hello spring");
	}
}
