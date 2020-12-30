package com.lexi.service.factoryMethod;


import com.lexi.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InstanceFactoryMethod {
	@Bean
	public static FactoryMethodObject createFactoryMethodObject()
	{
		return  new FactoryMethodObject();
	}

	@Bean
	public FactoryMethodObject createFactoryMethodObject1()
	{
		return  new FactoryMethodObject();
	}

	@Bean
	public FactoryMethodObject createFactoryMethodObject2(HelloService helloService)
	{
		return  new FactoryMethodObject();
	}
}
