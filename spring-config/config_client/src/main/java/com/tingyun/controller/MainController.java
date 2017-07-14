package com.tingyun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/7/14.
 * 获取git的先关信息
 */
@RestController
@RefreshScope
public class MainController {


    @Value("${from}")
    private String str;

    @RequestMapping(value = "/from")
    public String  from(){
        return this.str;
    }
}
