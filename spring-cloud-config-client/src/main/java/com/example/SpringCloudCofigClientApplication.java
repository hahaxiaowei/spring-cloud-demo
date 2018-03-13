package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by sunwei on 2018-03-09 Time:16:15:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudCofigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCofigClientApplication.class,args);
        System.out.println("SpringCloudCofigClientApplication begins starts");
    }
}
