package cn.edu.xc.hfut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by sunwei on 2017/12/29 Time:10:41
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer.class,args);
        System.out.println("ConfigServer begins starting");
    }
}
