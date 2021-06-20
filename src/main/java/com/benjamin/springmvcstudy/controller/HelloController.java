package com.benjamin.springmvcstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hi(){
        System.out.println("hi...");

        return "hi...";
    }
}
