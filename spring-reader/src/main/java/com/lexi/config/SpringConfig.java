package com.lexi.config;

import com.lexi.service.HelloServiceCreateByAnnoBean;
import com.lexi.service.HelloServiceCreateByAnnoBeanAndFactoryBean;
import com.lexi.service.HelloServiceFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lexi")
public class SpringConfig {
	@Bean
	public HelloServiceCreateByAnnoBeanAndFactoryBean createHelloServiceCreateByAnnoBeanAndFactoryBean()
	{
		System.out.println("创建HelloServiceCreateByAnnoBeanAndFactoryBean对象-1");
		createHelloServiceCreateByAnnoBean();
		System.out.println("创建HelloServiceCreateByAnnoBeanAndFactoryBean对象-2");
		return new HelloServiceCreateByAnnoBeanAndFactoryBean();
	}

	@Bean
	public HelloServiceCreateByAnnoBean createHelloServiceCreateByAnnoBean()
	{
		System.out.println("创建HelloServiceCreateByAnnoBean对象");
		return new HelloServiceCreateByAnnoBean();
	}
}
