package com.study.security_kyunghan.handler.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAop {
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@Pointcut("@annotation(com.study.security_kyunghan.handler.aop.annotation.ValidationCheck")
	private void enable() {}
	
	
	@Before("enableValid")
	public void ValidBefore(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		LOGGER.info(">>>>> 유효성 검사 중...");
		
		
		for(Object arg: args) {
			
		}
		
	}
}
