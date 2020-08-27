package com.lexi.factoryPostProcessor;

import com.lexi.service.supplier.HelloServiceBySupplier;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class TestBeanDefinitionReg implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		RootBeanDefinition rbd=new RootBeanDefinition();
		rbd.setInstanceSupplier(()->{
			return  new HelloServiceBySupplier();
		});

		registry.registerBeanDefinition("helloServiceBySupplier",rbd);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
