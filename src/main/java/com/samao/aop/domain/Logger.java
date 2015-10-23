package com.samao.aop.domain;

import org.aspectj.lang.annotation.After;
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

    @Pointcut("execution(void com.samao.aop.domain.Camera.snap())")
    public void cameraSnap(){

    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto () {
        System.out.println("about to take a photo...");
    }

    @After("cameraSnap()")
    public void photoHasTaken () {
        System.out.println("The photo has been taken ...");
    }
}
