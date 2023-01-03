package com.study.springboot202210jeongeun.aop;

import com.study.springboot202210jeongeun.aop.annotation.TimerAspect;
import com.study.springboot202210jeongeun.aop.annotation.ValidAspect;
import com.study.springboot202210jeongeun.service.UserService;
import com.study.springboot202210jeongeun.web.dto.CMRespDto;
import com.study.springboot202210jeongeun.web.dto.UsernameDto;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@Aspect
@Component
public class TimerAop {

    @Pointcut("@annotation(com.study.springboot202210jeongeun.aop.annotation.TimerAspect)")
    private void annotationPointCut() {}

    @Around("annotationPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object returnValue = proceedingJoinPoint.proceed();

        stopWatch.stop();
        String className = proceedingJoinPoint.getSignature().getDeclaringTypeName();
        String methodName = proceedingJoinPoint.getSignature().getName();

        log.error("Class >> {}, Method >> {}: {}초", className, methodName, stopWatch.getTotalTimeSeconds());

        return returnValue;
    }

}