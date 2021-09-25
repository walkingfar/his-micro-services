package com.silk.his.diagservice1.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author qianyf
 * @Date 2021-08-12
 */
@Aspect
@Component
public class TestAop {
    @Pointcut("@annotation(com.silk.his.annotation.AopAnnotation)")
    public void pointCut(){

    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("start");
        return proceedingJoinPoint.proceed();
    }
}
