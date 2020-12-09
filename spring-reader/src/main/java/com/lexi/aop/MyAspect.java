package com.lexi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(* com.lexi.service.jdkDynamicAopService.*.*(..))")
	public void PointCut()
	{

	}

	@Pointcut("execution(String com.lexi.service.jdkDynamicAopService.*.*(..))")
	public void PointCut1()
	{

	}

	@Around("PointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around before");
		Object retObj= joinPoint.proceed();
		System.out.println("around after");
		return retObj;
	}

	@Before("PointCut1()")
	public void before(JoinPoint joinPoint)
	{
		System.out.println("before");
	}

	@AfterReturning("PointCut()")
	public void afterReturning(JoinPoint joinPoint)
	{
		System.out.println("afterReturning");
	}

	@After("PointCut()")
	public void after()
	{
		System.out.println("after");
	}



	@AfterThrowing("PointCut()")
	public void afterThrowing(JoinPoint joinPoint)
	{
		System.out.println("afterThrowing");
	}

}
