package com.example.demo.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlar {

    @RequestMapping("/hello")
    public String syaHi(){
        return "Hi";
    }

}
