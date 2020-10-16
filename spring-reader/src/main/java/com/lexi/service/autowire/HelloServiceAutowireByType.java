package com.lexi.service.autowire;

import com.lexi.service.HelloService;
import com.lexi.service.IHelloServiceAutowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class HelloServiceAutowireByType {
	private HelloService helloService;
	private String name;
	private HelloServiceAutowireByType1 helloServiceAutowireByType1;
	private HelloServiceAutowireByType helloServiceAutowireByType;
	private List<IHelloServiceAutowired> helloServiceAutowiredList;
	private IHelloServiceAutowired helloServiceAutowired;

	public HelloService getHelloService111() {
		return helloService;
	}
	public void setHelloService111(HelloService helloService) {
		this.helloService = helloService;
	}

	public HelloServiceAutowireByType1 getHelloServiceAutowireByType1() {
		return helloServiceAutowireByType1;
	}
	public void setHelloServiceAutowireByType1(HelloServiceAutowireByType1 helloServiceAutowireByType1) {
		this.helloServiceAutowireByType1 = helloServiceAutowireByType1;
	}

	public String getName() {
		return name;
	}
	public void setName(@Value("lexi") String name) {
		this.name = name;
	}

	public HelloServiceAutowireByType getHelloServiceAutowireByType() {
		return helloServiceAutowireByType;
	}
	public void setHelloServiceAutowireByType(HelloServiceAutowireByType helloServiceAutowireByType) {
		this.helloServiceAutowireByType = helloServiceAutowireByType;
	}

	public List<IHelloServiceAutowired> getHelloServiceAutowiredList() {
		return helloServiceAutowiredList;
	}
	public void setHelloServiceAutowiredList(List<IHelloServiceAutowired> helloServiceAutowiredList) {
		this.helloServiceAutowiredList = helloServiceAutowiredList;
	}

	public IHelloServiceAutowired getHelloServiceAutowired() {
		return helloServiceAutowired;
	}
	public void setHelloServiceAutowired(IHelloServiceAutowired helloServiceAutowired) {
		this.helloServiceAutowired = helloServiceAutowired;
	}
}
