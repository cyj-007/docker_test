package com.example.docker_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/test")
    public String test(){
        return "访问成功";

    }

}
