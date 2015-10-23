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

    @Pointcut("execution(void com.samao.aop.domain.Camera.snap())")
    //==>> (..) is a wildcard --> accept any types of arguments
    public void cameraSnap() {

    }


    @Before("cameraSnap()")
    public void beforeAdvise() {
        System.out.println("Before advise ...");
    }

    @After("cameraSnap()")
    public void afterAdvise() {
        System.out.println("After advise ...\n");
    }

    @AfterReturning("cameraSnap()")
    public void afterReturningAdvise() {
        System.out.println("After returning advise ...");
    }

    @AfterThrowing("cameraSnap()")
    public void afterThrowingAdvise() {
        System.out.println("After throwing advise ...\n");
    }

    @Around("cameraSnap()")
    public void aroundAdvise(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Around advise (before) ...\n");

        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("In around advise " + throwable.getMessage());
        }

        System.out.println("Around advise (after) ...");
    }

}
