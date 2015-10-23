package com.samao.aop.domain;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/23/15.
 */

@Component
public class Camera {

    public void snap ()throws Exception{
        System.out.println("SNAP!");

       // throw new Exception("bye bye");
    }




}
