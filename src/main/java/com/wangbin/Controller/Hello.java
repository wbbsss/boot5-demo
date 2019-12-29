package com.wangbin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String sayHello(){
        return "welcome spring boot";
    }
}
