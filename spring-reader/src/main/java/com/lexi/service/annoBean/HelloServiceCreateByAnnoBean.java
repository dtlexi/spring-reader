package com.lexi.service.annoBean;

import org.springframework.context.annotation.Bean;

/**
 * 使用@Bean注解创建的
 */
public class HelloServiceCreateByAnnoBean {
	public void say()
	{
		System.out.println("HelloServiceCreateByAnnoBean");
	}
}
