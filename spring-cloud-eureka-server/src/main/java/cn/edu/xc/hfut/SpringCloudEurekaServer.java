package cn.edu.xc.hfut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sunwei on 2017/12/29 Time:10:28
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer.class,args);
        System.out.println("EurekaServer begins starting");
    }
}
