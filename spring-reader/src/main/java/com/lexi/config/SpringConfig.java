package com.lexi.config;

import com.lexi.service.*;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

//@Configuration
@ComponentScan("com.lexi")
@EnableAspectJAutoProxy
@ImportResource("classpath:beans.xml")
public class SpringConfig {
	@Bean
	public HelloServiceCreateByAnnoBean createHelloServiceCreateByAnnoBean()
	{
		return new HelloServiceCreateByAnnoBean();
	}


}
