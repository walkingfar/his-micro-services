package com.silk.his.diagservice2;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@SpringBootApplication
public class DiagService2Application {
    @Value("${redis.host}")
    private String redisHost;

    public static void main(String[] args) {
        SpringApplication.run(DiagService2Application.class, args);
    }

    @Bean
    public RocketMQTemplate getRocketMQTemplate() {
        return new RocketMQTemplate();
    }

    @Bean
    public Jedis getJedis(){
        return new JedisPool(redisHost).getResource();
    }
}
