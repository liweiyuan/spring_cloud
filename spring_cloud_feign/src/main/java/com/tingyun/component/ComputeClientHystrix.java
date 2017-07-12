package com.tingyun.component;

import com.tingyun.service.ComputeClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tingyun on 2017/7/12.
 * 回调类ComputeClientHystrix，实现@FeignClient的接口，此时实现的方法就是对应@FeignClient接口中映射的fallback函数。
 */
@Component
public class ComputeClientHystrix implements ComputeClient{
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -999;
    }
}
