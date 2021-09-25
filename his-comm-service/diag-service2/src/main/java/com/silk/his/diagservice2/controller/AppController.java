package com.silk.his.diagservice2.controller;

import com.silk.his.diagservice2.entity.RedisEntity;
import com.silk.his.diagservice2.service.AppService;
import com.silk.his.diagservice2.service.RocketMQProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author qianyf
 * @date 2021-07-08
 */
@RestController
public class AppController {
    @Resource
    private AppService appService;

    @Resource
    private RocketMQProducer rocketMQProducer;

    @Resource
    private Jedis jedis;

    @GetMapping("v1/diag")
    public String getDiag() {
        return appService.getValue();
    }

    @PostMapping("v1/rocketmq")
    public String testRocketmq() {
        for (int i = 0; i < 10; i++) {
            rocketMQProducer.sendMsg("test" + i);
        }
        return "success";
    }

    @PostMapping("v1/test")
    public String test() {
        return "success";
    }

    @PostMapping("v1/redisMap")
    public String redisSet(@RequestBody List<RedisEntity> entity) {
        for (RedisEntity en : entity) {
            jedis.set(en.getKey(), en.getValue());
        }
        return "1";
    }

}
