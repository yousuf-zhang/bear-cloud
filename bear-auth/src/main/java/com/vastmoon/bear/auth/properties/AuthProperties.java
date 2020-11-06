package com.vastmoon.bear.auth.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * <p> ClassName: AuthProperties
 * <p> Description: // TODO
 *
 * @author yousuf 2020/11/5
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:bear-auth.yml"}, factory = PropertySourceFactory.class)
@ConfigurationProperties(prefix = "bear.auth")
public class AuthProperties {
    private ClientProperties[] clients = {};
    private int accessTokenValiditySeconds = 60 * 60 * 24;
    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7;
}
