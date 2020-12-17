package com.lexi.importDemo;

import org.springframework.context.annotation.Bean;

public class Test1 {

	@Bean
	public Test2 createTest2()
	{
		return new Test2();
	}
}
