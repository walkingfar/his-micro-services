package com.silk.demo.consumerservice.controller;

import com.silk.demo.consumerservice.config.FeignConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author qianyf
 * @date 2021-07-08
 */
@RestController
public class AppController {
    private final static String URL = "http://PROVIDER/";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private FeignConfig feignConfig;

    @GetMapping("get/diag")
    public String getDiag() throws Exception {
        //return restTemplate.getForObject(URL + "v1/diag", String.class);
        long start = System.currentTimeMillis();
        String result = feignConfig.getDiag();
        long end = System.currentTimeMillis();
        return result + ">>>>>>>" + (end - start);
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }
}
