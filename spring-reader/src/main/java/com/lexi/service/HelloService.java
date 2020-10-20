package com.lexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class HelloService implements IHelloService {
	@Value("lexi")
	String name;

	@Value("#{18}")
	int age;

	@Value("180")
	int height;

	private HelloServiceAutowired1 helloServiceAutowired1;
	public HelloServiceAutowired1 getHelloServiceAutowired1() {
		return helloServiceAutowired1;
	}
	@Autowired
	public void setHelloServiceAutowired1(HelloServiceAutowired1 helloServiceAutowired1) {
		this.helloServiceAutowired1 = helloServiceAutowired1;
	}


	@Autowired
	public void test(HelloServiceAutowired2 helloServiceAutowired2)
	{
		System.out.println(helloServiceAutowired2);
		System.out.println("test");
	}


	@Resource(name = "helloServiceAutowired2")
	private HelloServiceAutowired2 helloServiceAutowired2;


	@Autowired
	@Qualifier("helloServiceAutowired1")
	private IHelloServiceAutowired helloServiceAutowired;

	@Override
	public String toString() {
		return "HelloService{" +
				"name='" + name + '\'' +
				", age=" + age +
				", height=" + height +
				", helloServiceAutowired1=" + helloServiceAutowired1 +
				'}';
	}
}
