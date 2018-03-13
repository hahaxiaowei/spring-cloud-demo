package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sunwei on 2018-03-09 Time:10:09:13
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServer02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer02Application.class,args);
        System.out.println("com.example.SpringCloudEurekaServer02Application begins starting");
    }
}
