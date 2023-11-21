package com.bilgeadam.JavaSpringDemo;

import org.springframework.stereotype.Component;

@Component
public class ComponentBean {

    public void doSomething() {
        System.out.println("Doing something in ComponentBean");
    }
}
