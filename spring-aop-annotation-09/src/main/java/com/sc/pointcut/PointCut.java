package com.sc.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class PointCut {
    @Pointcut("execution(* com..impl.*.*(..))")
    public void method1(){

    }
    @Pointcut("execution(* com.sc.service.impl.*.*(..))")
    public void method2(){

    }
}
