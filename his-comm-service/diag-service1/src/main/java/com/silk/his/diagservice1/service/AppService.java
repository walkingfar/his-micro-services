package com.silk.his.diagservice1.service;

import com.silk.his.diagservice1.config.ConfigEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qianyf
 * @date 2021-07-13
 */
@Service
@RefreshScope
public class AppService {
    @Resource
    private ConfigEntity configEntity;

    @Value("${test.value}")
    private String value;

    public String getDiag() {
        return "ConfigurationProperties:" + configEntity.getValue() + "-------Value:" + value;//configEntity.getValue();
    }
}
