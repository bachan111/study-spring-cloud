package com.bachan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bachan
 * @desc
 * @date 2021/12/16
 */
@RefreshScope //支持nacos的动态刷新功能
@RestController
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
