package com.lexi.service.annoBean;

import com.lexi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceWithAnnoCons {
	@Autowired(required = false)
	public HelloServiceWithAnnoCons()
	{

	}

	@Autowired(required = true)
	public HelloServiceWithAnnoCons(HelloService helloService)
	{

	}
}
