package com.pasindu.spring.springexceptionhandling.controller;

import com.pasindu.spring.springexceptionhandling.model.User;
import com.pasindu.spring.springexceptionhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

@Autowired
UserService userService;

    @GetMapping("users")
    public ResponseEntity<List<User>> fetchAll(){
        try {
            return ResponseEntity.ok(userService.findAll());
        }catch (ParseException e){
            System.out.println("Date Parse Exception happened");
        }
        return null;
    }

    @GetMapping("users/{fName}")
    public ResponseEntity<List<User>> fetchByFirstName(@PathVariable String fName){
        try {
            return ResponseEntity.ok(userService.findByFirstName(fName));
        }catch (ParseException e){
            System.out.println("Date Parse Exception happened");
        }
        return null;
    }

//    @GetMapping("/hello")
//    public String sayHello(){
//        return "Hello World !";
//    }
}
