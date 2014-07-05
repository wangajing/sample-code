package com.jy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TraceAspect {
	
	@Before("execution(* com.jy.*.*(..))")
	public void doTrace(JoinPoint jp){
		System.out.println(jp.getTarget().getClass().getName()+"."+jp.getSignature().getName());
	}
}
