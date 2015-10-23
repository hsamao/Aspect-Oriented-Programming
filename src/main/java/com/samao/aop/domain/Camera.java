package com.samao.aop.domain;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/23/15.
 */

@Component
public class Camera {

    public void snap () {
        System.out.println("SNAP!");
    }

    public void snap (int exposure) {
        System.out.println("SNAP! Exposure "+ exposure);
    }

    public String snap(String name) {
        System.out.println("camera name: " + name);
        return name;
    }

    public void nightMode () {
        System.out.println("Night mode photo");
    }


}
