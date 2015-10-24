package com.samao.aop.domain;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/23/15.
 */

@Component
public class Camera implements PhotoSnapper{

    public void snap (){
        System.out.println("SNAP!");

    }

    public void snap (int shots){
        System.out.println("SNAP! " + shots);

    }

    public void snap (double shots){
        System.out.println("SNAP! " + shots);

    }

    public void snap (int shot, double shots){
        System.out.println("SNAP! " + shot + " " + shots);

    }



}
