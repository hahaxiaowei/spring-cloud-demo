package com.expamle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sunwei on 2018-03-09 Time:10:09:27
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServer03Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer03Application.class,args);
        System.out.println("com.expamle.SpringCloudEurekaServer02Application begins starting");
    }
}
