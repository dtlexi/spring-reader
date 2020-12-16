package com.lexi.importDemo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ImportBeanDefinitionRegistrarDemo implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition rootBeanDefinition=new RootBeanDefinition();
		rootBeanDefinition.setBeanClass(Test1.class);
		rootBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);

		registry.registerBeanDefinition("test1",rootBeanDefinition);
	}
}
