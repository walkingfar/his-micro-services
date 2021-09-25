package com.silk.demo.consumerservice.config;

import org.springframework.stereotype.Component;

/**
 * @author qianyf
 * @date 2021-07-09
 */
@Component
public class FeignHystrixImpl implements FeignConfig {
    private final static String fallBackInfo = "Hystrix fallback";

    @Override
    public String getDiag() {
        return fallBackInfo;
    }

    @Override
    public String testRocketmq() {
        return fallBackInfo;
    }

    @Override
    public String test() {
        return fallBackInfo + ":test";
    }
}
