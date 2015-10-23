package com.samao.aop.domain;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/23/15.
 */

@Component
@Aspect
public class Logger {

    @Pointcut("execution(void com.samao.aop.domain.Camera.snap(..))")
    //==>> (..) is a wildcard --> accept any types of arguments
    public void cameraSnap() {

    }

    @Pointcut("execution(* com.samao.aop.domain.Camera.*(..))")
    //==>> first * ==> will be applied on any method return types
    //==>> second * ==> will be applied on any method in that package
    public void cameraSnapShot() {

    }

    @Pointcut("execution(* *.*(..))")
    //==>> first * ==> will be applied on any method return types
    //==>> second * ==> will be applied on any method in that package
    public void anyCamera() {

    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("about to take a photo...");
    }

    @After("cameraSnapShot()")
     public void photoHasTaken() {
        System.out.println("The photo has been taken ...\n");
    }



}
