package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

//	public HelloService()
//	{
//
//	}
//	@Autowired(required = false)
//	public HelloService(HelloServiceByXml xml)
//	{
//
//	}
//
//	@Autowired(required = false)
//	public HelloService(HelloServiceByXml xml,TestFindConstractService testFindConstractService)
//	{
//
//	}

	public HelloService(HelloServiceByXml xml)
	{

	}

	public HelloService(HelloServiceByXml xml,String str)
	{

	}
	public void sayHello()
	{
		System.out.println("Hello Spring");
	}
}
