package com.lexi.config;

import com.lexi.service.annoBean.HelloServiceCreateByAnnoBean;
import org.springframework.context.annotation.*;

//@Configuration
@ComponentScan("com.lexi")
@EnableAspectJAutoProxy(proxyTargetClass = false,exposeProxy = true)
@ImportResource("classpath:beans.xml")
public class SpringConfig {
	@Bean
	public HelloServiceCreateByAnnoBean createHelloServiceCreateByAnnoBean()
	{
		return new HelloServiceCreateByAnnoBean();
	}
}
