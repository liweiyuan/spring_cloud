package com.tingyun.controller;

import com.tingyun.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/7/12.
 * 通过Spring MVC的注解来配置compute-service服务下的具体实现。
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(10,20);
    }
}
