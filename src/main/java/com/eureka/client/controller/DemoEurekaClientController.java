package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/")
public class DemoEurekaClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("hello/client")
    public String hello(){
        return "hello from client";
        //String url = " http://localhost:8761/rest/hello/server";
       // return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("hello/eclient")
    public String ehello(){

        String url = "http://eureka-client-server/rest/hello/server";
         return restTemplate.getForObject(url,String.class);
    }
}
