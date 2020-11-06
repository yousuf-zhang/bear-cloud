package com.vastmoon.bear.auth.properties;

import lombok.Data;

/**
 * <p> ClassName: ClientsProperties
 * <p> Description: client配置项
 *
 * @author yousuf 2020/11/5
 */
@Data
public class ClientProperties {
    private String client;
    private String secret;
    private String grantType = "password,authorization_code,refresh_token";
    private String scope = "all";
}
