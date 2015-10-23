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
}
