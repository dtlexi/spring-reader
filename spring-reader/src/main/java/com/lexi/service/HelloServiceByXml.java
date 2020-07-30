package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class HelloServiceByXml {
	public void setHelloServiceAutowired1(HelloServiceAutowired1 helloServiceAutowired1) {
		this.helloServiceAutowired1 = helloServiceAutowired1;
	}

	public void setHelloServiceAutowired2(HelloServiceAutowired2 helloServiceAutowired2) {
		this.helloServiceAutowired2 = helloServiceAutowired2;
	}
	public void setHelloServiceAutowired999(HelloServiceAutowired2 helloServiceAutowired2) {
		this.helloServiceAutowired2 = helloServiceAutowired2;
	}

	private HelloServiceAutowired1 helloServiceAutowired1;
	private HelloServiceAutowired2 helloServiceAutowired2;
}
