package com.silk.his.diagservice2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author qianyf
 * @date 2021-07-14
 */
@Service
@RefreshScope
public class AppService {
    @Value("${test.value}")
    private String value;

    public String getValue(){
        return value;
    }
}
