package com.vastmoon.common.security.annotation;

import com.vastmoon.common.security.config.BearAuthExceptionConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p> ClassName: EnableBearAuthExceptionHandler
 * <p> Description: 启动配置项注解
 *
 * @author yousuf 2020/11/6
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(BearAuthExceptionConfigure.class)
public @interface EnableBearAuthExceptionHandler {
}
