package com.vastmoon.bear.auth.translator;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * <p> ClassName: CustomOAuth2Exception
 * <p> Description: 自己封装异常
 *
 * @author yousuf 2020/11/5
 */
@JsonSerialize(using = CustomOAuthExceptionJacksonSerializer.class)
public class CustomOAuth2Exception extends OAuth2Exception {
    private static final long serialVersionUID = 7694300897466570655L;

    public CustomOAuth2Exception(String msg, Throwable t) {
        super(msg, t);
    }

    public CustomOAuth2Exception(String msg) {
        super(msg);
    }
}
