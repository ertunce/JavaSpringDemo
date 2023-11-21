package com.bilgeadam.JavaSpringDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerBean {

    private final ServiceBean serviceBean;

    //Constructor injection
    public ControllerBean(ServiceBean serviceBean){
        this.serviceBean = serviceBean;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        serviceBean.performService();
        return ResponseEntity.ok().body("Endpoint hit!");
    }

}
