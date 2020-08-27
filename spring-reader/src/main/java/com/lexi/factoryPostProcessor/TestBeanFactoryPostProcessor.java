package com.lexi.factoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//AbstractBeanDefinition beanDefinition= (AbstractBeanDefinition) beanFactory.getBeanDefinition("helloService");
//		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("10");
//		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("张三");
	}
}
