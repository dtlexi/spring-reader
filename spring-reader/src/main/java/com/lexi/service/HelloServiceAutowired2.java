package com.lexi.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("helloServiceAutowired1")
public class HelloServiceAutowired2 implements IHelloServiceAutowired {
}
