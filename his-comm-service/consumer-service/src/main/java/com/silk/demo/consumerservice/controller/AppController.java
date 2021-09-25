package com.silk.demo.consumerservice.controller;

import com.silk.demo.consumerservice.config.FeignConfig;
import com.silk.his.annotation.AopAnnotation;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author qianyf
 * @date 2021-07-08
 */
@RestController
@RequestMapping("service")
//@Api(value = "euraka-consumer",description = "euraka-consumer-service")
public class AppController {
    private final static String URL = "http://PROVIDER/";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private FeignConfig feignConfig;

    /**
     * 返回远程数据仓库配置
     *
     * @return
     * @throws Exception
     */
    @GetMapping("/get/diag")
    //@ApiOperation("返回远程数据仓库配置")
    @AopAnnotation
    public String getDiag() throws Exception {
        //return restTemplate.getForObject(URL + "v1/diag", String.class);
        long start = System.currentTimeMillis();
        String result = feignConfig.getDiag();
        long end = System.currentTimeMillis();
        return result + ">>>>>>>" + (end - start);
    }

    @GetMapping("get/rocket")
    public String testRocket() {
        return feignConfig.testRocketmq();
    }

    @PostMapping("get/test")
    public String test() {
        return feignConfig.test();
    }
}
