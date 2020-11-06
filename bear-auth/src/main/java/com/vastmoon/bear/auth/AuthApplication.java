package com.vastmoon.bear.auth;

import com.vastmoon.common.security.annotation.EnableBearAuthExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p> ClassName: AuthApplication
 * <p> Description: 启动类
 *
 * @author yousuf 2020/11/4
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableBearAuthExceptionHandler
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
