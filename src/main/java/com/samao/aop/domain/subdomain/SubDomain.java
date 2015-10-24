package com.samao.aop.domain.subdomain;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/23/15.
 */

@Component("subdomain")
public class SubDomain {

    public void subDomain () {
        System.out.println("subDomain method was called!");
    }
}
