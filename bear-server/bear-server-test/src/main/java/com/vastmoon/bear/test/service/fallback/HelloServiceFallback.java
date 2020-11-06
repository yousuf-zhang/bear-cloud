package com.vastmoon.bear.test.service.fallback;

import com.vastmoon.bear.test.service.HelloService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p> ClassName: HelloServiceFallback
 * <p> Description: // TODO
 *
 * @author yousuf 2020/11/6
 */
@Slf4j
@Component
public class HelloServiceFallback implements FallbackFactory<HelloService> {
    @Override
    public HelloService create(Throwable cause) {
        return new HelloService() {
            @Override
            public String hello(String name) {
                log.error("调用febs-server-system服务出错", cause);
                return "调用出错";
            }
        };
    }
}
