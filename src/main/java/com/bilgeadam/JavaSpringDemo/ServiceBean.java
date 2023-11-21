package com.bilgeadam.JavaSpringDemo;

import org.springframework.stereotype.Service;

@Service
public class ServiceBean {

    private final ComponentBean componentBean;

    //Constructor injection
    public ServiceBean(ComponentBean componentBean){
        this.componentBean = componentBean;
    }

    public void performService(){
        componentBean.doSomething();
        System.out.println("Service is performing its task.");
    }
}
