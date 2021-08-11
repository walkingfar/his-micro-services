package com.silk.his.diagservice1;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class DiagService1Application {

    public static void main(String[] args) {
        SpringApplication.run(DiagService1Application.class, args);
    }

    @Bean
    public RocketMQTemplate getRocketMQTemplate() {
        return new RocketMQTemplate();
    }
}
