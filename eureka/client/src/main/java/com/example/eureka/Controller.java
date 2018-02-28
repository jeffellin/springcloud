package com.example.eureka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Service service;


    @RequestMapping(path = "/sayhi")
    public String sayHiRemote(){
            return service.sayHiRemote();
    }
}
