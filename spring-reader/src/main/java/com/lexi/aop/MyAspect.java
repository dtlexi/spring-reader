package com.lexi.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(* com.lexi.service.*.*(..))")
	public void PointCut()
	{

	}

	@Before("PointCut()")
	public void before()
	{
		System.out.println("before ........");
	}
}
