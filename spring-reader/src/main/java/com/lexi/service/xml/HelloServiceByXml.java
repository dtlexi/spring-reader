package com.lexi.service.xml;

import com.lexi.service.HelloServiceAutowired2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloServiceByXml {

	public HelloServiceAutowired2 getHelloServiceAutowired2()
	{
		return  null;
	}
//	@PostConstruct
//	public void initByAnno()
//	{
//		System.out.println("HelloServiceByXml PostConstruct");
//	}
//
//	public void initByXml()
//	{
//		System.out.println("HelloServiceByXml init by xml");
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("HelloServiceByXml afterPropertiesSet");
//	}
//
//	@PreDestroy
//	public void destroy(){
//		System.out.println("destroy");
//	}
}
