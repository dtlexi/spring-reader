package com.lexi.service.xml;

public class HelloServiceFactory {
	public HelloServiceCreateByFactory createHelloServiceCreateByFactory()
	{
		return new HelloServiceCreateByFactory();
	}

	public HelloServiceCreateByFactory createHelloServiceCreateByFactory(String str)
	{
		return new HelloServiceCreateByFactory();
	}

	public void sayHello()
	{
		System.out.println("hello spring");
	}
}
