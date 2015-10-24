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

    @Pointcut("args(exposure, aperture)")

    public void cameraSnapArg(int exposure, double aperture) {

    }

    @Before("cameraSnapArg(exposure, aperture)")
    public void beforeArg(JoinPoint joinPoint, int exposure, double aperture) {
        System.out.println("********* Before Arg *********");

        System.out.printf("exposure %d, aperture %.2f\n", exposure, aperture);
    }


/*

    @Before("cameraSnap()")
    public void beforeAdvice() {
        System.out.println("********* Before Advice *********");
    }
*/



}
