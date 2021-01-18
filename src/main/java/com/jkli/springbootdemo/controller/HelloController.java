package com.jkli.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class HelloController {
    @Qualifier("counterService")
    @Autowired
    private CounterService counterService;

    @RequestMapping("/helloCount")
    public String greet(){
        counterService.increment("jkli.hello.count");
        return counterService.toString();
    }

    @RequestMapping("/hello")
    public String index(){
        return "Hello!";
    }
}
