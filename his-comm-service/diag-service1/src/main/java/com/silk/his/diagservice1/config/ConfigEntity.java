package com.silk.his.diagservice1.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author qianyf
 * @date 2021-07-14
 */
@Component
@Data
@ConfigurationProperties(prefix = "test")
public class ConfigEntity {
    private String value;
}
