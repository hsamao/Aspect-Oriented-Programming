package com.samao.aop.domain;

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

    @Pointcut("args(Double)")

    public void cameraSnapArg() {

    }

    @Before("cameraSnapArg()")
    public void beforeArg() {
        System.out.println("********* Before Arg *********");
    }


/*

    @Before("cameraSnap()")
    public void beforeAdvice() {
        System.out.println("********* Before Advice *********");
    }
*/



}
