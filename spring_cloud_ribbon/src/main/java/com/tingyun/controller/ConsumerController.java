package com.tingyun.controller;

import com.tingyun.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/6/13.
 * 创建ConsumerController来消费COMPUTE-SERVICE的add服务。通过直接RestTemplate来调用服务，计算10 + 20的值。
 */
@RestController
public class ConsumerController {
    /*@Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }*/


    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return computeService.addService();
    }

}
