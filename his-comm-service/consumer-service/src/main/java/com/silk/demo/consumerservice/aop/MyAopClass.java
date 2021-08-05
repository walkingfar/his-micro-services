package com.silk.demo.consumerservice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Auth qyf
 * @Date 2021/8/5
 */
@Aspect
@Component
public class MyAopClass {
    @Pointcut("@annotation(com.silk.his.annotation.AopAnnotation)")
    public void point() {

    }

    @Before("point()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("before " + joinPoint.getSignature().getName());
    }

    @Around("point()")
    public Object doAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around aspect success");
        return proceedingJoinPoint.proceed();
    }


    @AfterReturning(pointcut = "point()", returning = "result")
    public void doReturning(JoinPoint joinPoint, Object result) {
        System.out.println("after returning:" + result);
    }
}