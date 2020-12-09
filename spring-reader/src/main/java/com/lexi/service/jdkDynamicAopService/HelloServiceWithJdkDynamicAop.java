package com.lexi.service.jdkDynamicAopService;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceWithJdkDynamicAop implements  IJdkDynamicAopService {
	public void say()
	{

	}

	public String say1()
	{
		return  "1";
	}
}
