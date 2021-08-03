package com.silk.his.diagservice1.controller;

import com.silk.his.diagservice1.service.AppService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author qianyf
 * @date 2021-07-08
 */
@RestController()
@RequestMapping("/service")
public class AppController {

    @Resource
    private AppService appService;

    @GetMapping("/v1/diag")
    public String getDiag(){
        return appService.getDiag();
    }
}
