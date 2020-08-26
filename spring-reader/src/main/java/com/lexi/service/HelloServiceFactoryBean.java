package com.lexi.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceFactoryBean implements FactoryBean<HelloServiceCreateByAnnoBeanAndFactoryBean> {
	@Override
	public HelloServiceCreateByAnnoBeanAndFactoryBean getObject() throws Exception {
		return new HelloServiceCreateByAnnoBeanAndFactoryBean();
	}

	@Override
	public Class<?> getObjectType() {
		return HelloServiceCreateByAnnoBeanAndFactoryBean.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
