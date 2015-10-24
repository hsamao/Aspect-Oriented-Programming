package com.samao.aop.domain;

import com.samao.aop.domain.subdomain.SubDomain;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hsamao on 10/23/15.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/samao/aop/aop-config.xml");

        Camera camera = (Camera) context.getBean("camera");
        SubDomain subDomain = (SubDomain) context.getBean("subdomain");

        camera.snap();
        camera.snap(10);
        camera.snap(5L);
        camera.snap(3, 8L);


        subDomain.subDomain();

        context.close();

    }

}
