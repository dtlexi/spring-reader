package com.lexi.service.conditional.anno;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(com.lexi.service.conditional.ConditionalOnBean.class)
public @interface ConditionalOnBean {
	Class<? extends Object> value();
}
