package com.silk.his.diagservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianyf
 * @date 2021-07-08
 */
@RestController("test")
public class AppController {
    @GetMapping("v1/diag")
    public String getDiag() throws InterruptedException {
        return "123";
    }
}
