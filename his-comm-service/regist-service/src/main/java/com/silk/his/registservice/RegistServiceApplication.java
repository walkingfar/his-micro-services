package com.silk.his.registservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistServiceApplication.class, args);
    }

}
