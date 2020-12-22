package com.lexi.config;

import com.lexi.importDemo.ImportBeanDefinitionRegistrarDemo;
import com.lexi.importDemo.ImportSelectorDemo;
import com.lexi.service.annoBean.HelloServiceCreateByAnnoBean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.lexi")
@EnableAspectJAutoProxy(proxyTargetClass = false,exposeProxy = true)
@ImportResource("classpath:beans.xml")
@Import(ImportBeanDefinitionRegistrarDemo.class)
public class SpringConfig {
	@Bean
	public HelloServiceCreateByAnnoBean createHelloServiceCreateByAnnoBean()
	{
		return new HelloServiceCreateByAnnoBean();
	}

	public void test()
	{
		this.createHelloServiceCreateByAnnoBean();
	}
}
