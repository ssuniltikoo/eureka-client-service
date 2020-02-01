package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientDemo {
    public static void main(String... args) {

        SpringApplication.run(EurekaClientDemo.class, args);
    }
}
