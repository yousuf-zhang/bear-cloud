package com.vastmoon.bear.auth.config;

import com.vastmoon.common.security.handler.BearAccessDeniedHandler;
import com.vastmoon.common.security.handler.BearAuthExceptionEntryPoint;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * <p> ClassName: BearResourceServerConfigure
 * <p> Description: 资源服务器配置
 *
 * @author yousuf 2020/11/4
 */
@Configuration
@RequiredArgsConstructor
@EnableResourceServer
public class BearResourceServerConfigure extends ResourceServerConfigurerAdapter {
    private final BearAccessDeniedHandler accessDeniedHandler;
    private final BearAuthExceptionEntryPoint exceptionEntryPoint;
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/**").authenticated();
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.authenticationEntryPoint(exceptionEntryPoint)
                .accessDeniedHandler(accessDeniedHandler);
    }
}
