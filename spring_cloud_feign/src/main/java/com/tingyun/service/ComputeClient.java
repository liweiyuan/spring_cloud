package com.tingyun.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tingyun on 2017/7/12.
 * 使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
 */
@FeignClient("compute-service")
public interface ComputeClient {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a,@RequestParam(value = "b") Integer b);
}
