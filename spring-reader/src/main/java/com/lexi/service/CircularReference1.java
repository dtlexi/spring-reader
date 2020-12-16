package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularReference1 {
	@Autowired
	public CircularReference2 circularReference2;


	public void say(){
		System.out.println(this.circularReference2);
		System.out.println("CircularReference1");
	}

	public class  InnerClass
	{

	}
}
