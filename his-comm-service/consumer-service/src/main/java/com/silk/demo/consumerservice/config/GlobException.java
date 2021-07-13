package com.silk.demo.consumerservice.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author qianyf
 * @date 2021-07-08
 */
@RestControllerAdvice
@Component
public class GlobException {
    @ExceptionHandler(Exception.class)
    public String customException(Exception e) {
        return e.getMessage() + "\n" + e;
    }
}
