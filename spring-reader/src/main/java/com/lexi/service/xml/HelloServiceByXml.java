package com.lexi.service.xml;

import com.lexi.service.HelloService;
import com.lexi.service.HelloServiceAutowired2;
import com.lexi.service.IHelloService;
import com.lexi.service.autowire.HelloServiceAutowireByName;
import com.lexi.service.other.Person;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class HelloServiceByXml implements IHelloService {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public HelloServiceAutowireByName getHelloServiceAutowireByName() {
		return helloServiceAutowireByName;
	}

	public void setHelloServiceAutowireByName(HelloServiceAutowireByName helloServiceAutowireByName) {
		this.helloServiceAutowireByName = helloServiceAutowireByName;
	}

	public List<Integer> getSize() {
		return size;
	}
	public void setSize(List<Integer> size) {
		this.size = size;
	}
	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}


	private HelloServiceAutowireByName helloServiceAutowireByName;
	private String name;
	private int age;
	private List<Integer> size;
	private int height;
	private Person person;
	private HelloService helloService;


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
