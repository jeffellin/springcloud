package com.example.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(path = "sayhi")
    public String sayHello(){

        System.out.println("This Server got Request.....");

        return "hello";
    }
}
