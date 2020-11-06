package com.vastmoon.bear.auth.handler;

import com.vastmoon.common.core.handler.BaseExceptionHandler;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p> ClassName: GlobalExceptionHandler
 * <p> Description: 全局异常
 *
 * @author yousuf 2020/11/6
 */
@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler extends BaseExceptionHandler {
}
