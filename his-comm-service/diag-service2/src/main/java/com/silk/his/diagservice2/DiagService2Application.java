package com.silk.his.diagservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class DiagService2Application {

    public static void main(String[] args) {
        SpringApplication.run(DiagService2Application.class, args);
    }

}
