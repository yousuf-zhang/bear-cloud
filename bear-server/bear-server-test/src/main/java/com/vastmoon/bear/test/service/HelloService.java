package com.vastmoon.bear.test.service;

import com.vastmoon.bear.test.service.fallback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p> ClassName: HelloService
 * <p> Description: 测试
 *
 * @author yousuf 2020/11/6
 */
@FeignClient(value = "bear-server-system", contextId = "helloServiceClient", fallbackFactory = HelloServiceFallback.class)
public interface HelloService {
    @GetMapping("hello")
    String hello(@RequestParam("name") String name);
}
