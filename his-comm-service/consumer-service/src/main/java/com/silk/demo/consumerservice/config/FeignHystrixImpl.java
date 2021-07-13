package com.silk.demo.consumerservice.config;

import org.springframework.stereotype.Component;

/**
 * @author qianyf
 * @date 2021-07-09
 */
@Component
public class FeignHystrixImpl implements FeignConfig{
    @Override
    public String getDiag(){
        return "Hystrix fallback";
    }
}