package com.lexi.config;

import com.lexi.importDemo.ImportBeanDefinitionRegistrarDemo;
import com.lexi.importDemo.ImportBeanSelectorDeferrd;
import com.lexi.importDemo.ImportBeanSelectorDeferrd2;
import com.lexi.importDemo.ImportSelectorDemo;
import com.lexi.service.annoBean.HelloServiceCreateByAnnoBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.lexi")
@EnableAspectJAutoProxy(proxyTargetClass = false,exposeProxy = true)
@ImportResource("classpath:beans.xml")
//@Import(ImportBeanDefinitionRegistrarDemo.class)
//@Import({ImportBeanSelectorDeferrd.class, ImportBeanSelectorDeferrd2.class})
public class SpringConfig implements BeanFactoryAware {
	@Bean
	public HelloServiceCreateByAnnoBean createHelloServiceCreateByAnnoBean()
	{
		return new HelloServiceCreateByAnnoBean();
	}

	public void test()
	{
		this.createHelloServiceCreateByAnnoBean();
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
	}
}
