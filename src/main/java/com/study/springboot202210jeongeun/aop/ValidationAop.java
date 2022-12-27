package com.study.springboot202210jeongeun.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAop {

    @Pointcut("execution(* com.study.springboot202210jeongeun.web.controller.account.AccountApiController.*(..))")
    private void executionPointcut() {

    }

    @Around("executionPointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();

        System.out.println("AOP 작동함!");

        for(Object arg : args) {
            System.out.println(arg);
        }

        return proceedingJoinPoint.proceed();
    }
}
