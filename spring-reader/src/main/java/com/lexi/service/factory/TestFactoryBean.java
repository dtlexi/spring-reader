package com.lexi.service.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<FactoryBeanObject> {
	@Override
	public FactoryBeanObject getObject() throws Exception {
		return  new FactoryBeanObject();
	}

	@Override
	public Class<?> getObjectType() {
		return FactoryBeanObject.class;
	}
}
