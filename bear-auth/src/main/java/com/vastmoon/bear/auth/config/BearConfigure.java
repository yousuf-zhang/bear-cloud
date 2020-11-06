package com.vastmoon.bear.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * <p> ClassName: BearConfigure
 * <p> Description: 基础配置类
 *
 * @author yousuf 2020/11/5
 */
@Configuration
public class BearConfigure {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
