package com.eureka.client.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.sun.security.ntlm.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/")
public class DemoEurekaClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient client;

    @GetMapping("hello/client")
    public String hello(@RequestHeader("x-location") String location){
        return "hello from client"+location;
        //String url = " http://localhost:8761/rest/hello/server";
       // return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("hello/eclient")
    public String ehello(){

        String url = "http://eureka-client-server/rest/hello/server";
        //InstanceInfo instanceInfo = client.getNextServerFromEureka("eureka-client-server",true);
        //String url = instanceInfo.getHomePageUrl();
       //url = url+"rest/hello/server";
        ResponseEntity<String> responseEntity= restTemplate.exchange(url, HttpMethod.GET,null,String.class);
        return responseEntity.getBody();
         //return restTemplate.getForObject(url,String.class);
    }
}
