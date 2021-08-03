package com.silk.demo.consumerservice.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qianyf
 * @date 2021-07-08
 */
@FeignClient(name = "PROVIDER", fallback = FeignHystrixImpl.class, path = "/service")
public interface FeignConfig {
    @GetMapping("v1/diag")
    String getDiag();
}


