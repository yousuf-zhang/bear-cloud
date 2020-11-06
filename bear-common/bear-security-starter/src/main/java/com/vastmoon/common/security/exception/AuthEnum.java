package com.vastmoon.common.security.exception;

import com.vastmoon.common.client.dto.RestCode;

/**
 * <p> ClassName: AuthEnum
 * <p> Description: 认证枚举
 *
 * @author yousuf 2020/11/6
 */
public enum  AuthEnum implements RestCode {
    /**登录认证码*/
    UNAUTHORIZED("UNAUTHORIZED", "Unauthorized"),
    FORBIDDEN("FORBIDDEN", "Forbidden"),
    ;
    private final String code;
    private final String message;

    AuthEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return this.code;
    }

    @Override
    public String message() {
        return this.message;
    }
}
