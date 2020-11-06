package com.vastmoon.common.security.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vastmoon.common.security.handler.BearAccessDeniedHandler;
import com.vastmoon.common.security.handler.BearAuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * <p> ClassName: BearAuthExceptionConfigure
 * <p> Description: AuthException 配置项
 *
 * @author yousuf 2020/11/6
 */
public class BearAuthExceptionConfigure {

    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public BearAccessDeniedHandler accessDeniedHandler(ObjectMapper objectMapper) {
        return new BearAccessDeniedHandler(objectMapper);
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public BearAuthExceptionEntryPoint authenticationEntryPoint(ObjectMapper objectMapper) {
        return new BearAuthExceptionEntryPoint(objectMapper);
    }
}
