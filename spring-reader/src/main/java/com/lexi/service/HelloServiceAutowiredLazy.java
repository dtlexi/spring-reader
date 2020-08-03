package com.lexi.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceAutowiredLazy {
	public HelloServiceAutowiredLazy()
	{

	}

	public void say()
	{
		System.out.println("hello lazy");
	}
}
