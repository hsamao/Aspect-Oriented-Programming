package com.samao.aop.domain;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/23/15.
 */

@Component
@Aspect
public class Logger {

    /*@Pointcut("bean(camera)")

    public void cameraSnap() {

    }*/

    @Pointcut("target(com.samao.aop.domain.Camera)")

    public void cameraSnapArg() {

    }

    @Before("cameraSnapArg()")
    public void beforeArg(JoinPoint joinPoint) {
        System.out.println("********* Before Arg *********");

       for (Object joint : joinPoint.getArgs()) {
           System.out.println("arg: " + joint);
       }
    }


/*

    @Before("cameraSnap()")
    public void beforeAdvice() {
        System.out.println("********* Before Advice *********");
    }
*/



}
