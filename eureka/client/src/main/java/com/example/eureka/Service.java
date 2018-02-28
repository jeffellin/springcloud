package com.example.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Service {

    @Autowired
    RestTemplate restTemplate;

    public String sayHiRemote(){

        return restTemplate.getForObject("http://eureka-service/sayhi",String.class);

    }


}
