package com.jy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TraceAspect {
	
	@Before("execution(* com.jy.*(..)) && target(bean)")
	public void doTrace(Object bean){
		System.out.println(bean.getClass().getName()+":");
	}
}
