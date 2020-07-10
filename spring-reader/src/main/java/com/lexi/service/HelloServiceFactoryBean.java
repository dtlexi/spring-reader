package com.lexi.service;

import org.springframework.beans.factory.FactoryBean;

public class HelloServiceFactoryBean implements FactoryBean<HelloServiceCreateByAnnoBeanAndFactoryBean> {
	@Override
	public HelloServiceCreateByAnnoBeanAndFactoryBean getObject() throws Exception {
		return new HelloServiceCreateByAnnoBeanAndFactoryBean();
	}

	@Override
	public Class<?> getObjectType() {
		return HelloServiceCreateByAnnoBeanAndFactoryBean.class;
	}
}
