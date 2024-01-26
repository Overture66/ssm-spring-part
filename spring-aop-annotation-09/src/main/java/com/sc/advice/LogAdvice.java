package com.sc.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {
    @Before("com.sc.pointcut.PointCut.method2()")
    public void start(){
        System.out.println("方法开始了");
    }
    @After("com.sc.pointcut.PointCut.method2()")
    public void after(){
        System.out.println("方法结束了");
    }
    @AfterThrowing("com.sc.pointcut.PointCut.method2()")
    public void error(){
        System.out.println("方法报错了");
    }
}
