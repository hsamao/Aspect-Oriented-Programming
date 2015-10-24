package com.samao.aop.domain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/23/15.
 */

@Component
@Aspect
public class Logger {

    @Pointcut("within(com.samao.aop.domain.Camera)")
    public void cameraSnap() {

    }

    @Before("cameraSnap()")
    public void beforeAdvice( ){
        System.out.println("********* Before Advice *********");
    }




}
