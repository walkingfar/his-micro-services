package com.silk.his.diagservice1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author qianyf
 * @date 2021-07-13
 */
@Service
@RefreshScope
public class AppService {
    @Value("${test}")
    private String testVlaue;

    public String getDiag(){
        return testVlaue;
    }
}
