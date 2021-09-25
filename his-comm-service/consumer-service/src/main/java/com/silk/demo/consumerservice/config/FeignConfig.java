package com.silk.demo.consumerservice.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author qianyf
 * @date 2021-07-08
 */
@FeignClient(name = "PROVIDER", fallback = FeignHystrixImpl.class)
public interface FeignConfig {
    @GetMapping("v1/diag")
    String getDiag();

    @PostMapping("v1/rocketmq")
    String testRocketmq();

    @PostMapping(value = "v1/test", consumes = "application/json", produces = "application/json")
    String test();
}


