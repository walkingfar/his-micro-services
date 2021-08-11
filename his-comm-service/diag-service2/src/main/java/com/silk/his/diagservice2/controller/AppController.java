package com.silk.his.diagservice2.controller;

import com.silk.his.diagservice2.service.AppService;
import com.silk.his.diagservice2.service.RocketMQProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @GetMapping("v1/diag")
    public String getDiag() {
        return appService.getValue();
    }

    @PostMapping("v1/sendRocketmq")
    public String testRocketmq() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            rocketMQProducer.sendMsg("test" + i);
        }
        return "success";
    }
}
