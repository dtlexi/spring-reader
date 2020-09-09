package com.lexi.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class TestLookUpService {

	@Lookup
	public HelloService getHelloService(){
		return  null;
	}

//	public HelloService getHelloService(HelloServiceAutowired1 helloServiceAutowired1){
//		return  null;
//	}
}
