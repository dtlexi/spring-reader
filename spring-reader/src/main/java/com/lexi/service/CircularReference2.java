package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularReference2 {
	@Autowired
	private CircularReference1 circularReference1;

	public void say(){
		System.out.println(this.circularReference1);
		System.out.println("circularReference2");
	}
}
