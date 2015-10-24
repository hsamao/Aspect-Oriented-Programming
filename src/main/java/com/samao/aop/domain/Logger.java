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

    @Pointcut("within(com.samao.aop.domain..*)")
    //==> a wildcard for scanning classes in the current package and sub packages
    public void cameraSnap() {

    }

    @Pointcut("target(com.samao.aop.domain.Camera)")
    public void targetSnap() {

    }

    @Pointcut("this(com.samao.aop.domain.Camera)")
    public void thisSnap() {

    }

    @Before("cameraSnap()")
    public void beforeAdvice() {
        System.out.println("********* Before Advice *********");
    }

    @Before("targetSnap()")
    public void beforeTarget() {
        System.out.println("********* Before Target *********");
    }

    @Before("thisSnap()")
    public void beforeThis() {
        System.out.println("********* Before This *********");
    }


}
