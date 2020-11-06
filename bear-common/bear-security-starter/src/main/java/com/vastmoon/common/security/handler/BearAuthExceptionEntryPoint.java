package com.vastmoon.common.security.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vastmoon.common.client.dto.RestBody;
import com.vastmoon.common.core.util.WebUtils;
import com.vastmoon.common.security.exception.AuthEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p> ClassName: BearAuthExceptionEntryPoint
 * <p> Description: 登录认证异常
 *
 * @author yousuf 2020/11/6
 */
@Slf4j
@RequiredArgsConstructor
public class BearAuthExceptionEntryPoint implements AuthenticationEntryPoint {
    private final ObjectMapper objectMapper;
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        log.warn("认证失败，method({}), uri({}), ip({})",
                request.getMethod(), WebUtils.requestFullUrl(request),
                WebUtils.getIpAddress());
        WebUtils.responseJsonWriter(response,
                objectMapper.writeValueAsString(RestBody.failure(AuthEnum.UNAUTHORIZED)),
                response.getStatus());
    }
}
