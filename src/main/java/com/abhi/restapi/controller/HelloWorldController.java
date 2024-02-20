package com.abhi.restapi.controller;

import com.abhi.restapi.model.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("hello-world-bean")
    public HelloWorldBean helloBean() {
        return new HelloWorldBean("Hello World!");
    }

    @GetMapping("hello-world/path/{name}")
    public String helloWorldPathVariable(@PathVariable String name) {
        return "Hello " + name;
    }
}
