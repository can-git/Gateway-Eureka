package com.example.secondservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class secondController {

    @GetMapping("/message")
    public String test(){
        return "Hello from second service";
    }
}
