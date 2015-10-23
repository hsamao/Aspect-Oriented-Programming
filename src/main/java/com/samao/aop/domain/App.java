package com.samao.aop.domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hsamao on 10/23/15.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/samao/aop/aop-config.xml");

        Camera camera = (Camera) context.getBean("camera");

        try {
            camera.snap();
        } catch (Exception e) {
            System.out.println("Caught exception " + e.getMessage());;
        }

        context.close();


    }

}
