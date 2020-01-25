package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class EurekaClientDemo {
    public static void main(String... args) {
        SpringApplication.run(EurekaClientDemo.class, args);
    }
}
