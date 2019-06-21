package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/hello")
    public String hello(){
        return "Hi, Welcome to Spring ";
    }

    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hi, Welcome to Spring Role ADMIN ";
    }
}
