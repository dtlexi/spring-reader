package com.lexi.service.autowire;

import com.lexi.service.HelloService;

public class HelloServiceAutowireByName {
	private HelloService helloService;

	public HelloService getHelloService111() {
		return helloService;
	}

	public void setHelloService111(HelloService helloService) {
		this.helloService = helloService;
	}
}
