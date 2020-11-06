package com.vastmoon.bear.gateway.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <p> ClassName: BearGatewaySecurityConfigure
 * <p> Description: 关闭csrf
 *
 * @author yousuf 2020/11/5
 */
@EnableWebSecurity
public class BearGatewaySecurityConfigure extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }
}
