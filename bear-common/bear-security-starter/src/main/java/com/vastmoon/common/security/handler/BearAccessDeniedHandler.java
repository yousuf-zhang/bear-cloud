package com.vastmoon.common.security.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vastmoon.common.client.dto.RestBody;
import com.vastmoon.common.core.util.WebUtils;
import com.vastmoon.common.security.exception.AuthEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p> ClassName: BearAccessDeniedHandler
 * <p> Description:
 *
 * @author yousuf 2020/11/6
 */
@Slf4j
@RequiredArgsConstructor
public class BearAccessDeniedHandler implements AccessDeniedHandler {
    private final ObjectMapper objectMapper;
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        log.warn("无权访问，method({}), uri({}), ip({})",
                request.getMethod(),
                WebUtils.requestFullUrl(request),
                WebUtils.getIpAddress());
        WebUtils.responseJsonWriter(response,
                objectMapper.writeValueAsString(RestBody.failure(AuthEnum.FORBIDDEN)),
                HttpServletResponse.SC_FORBIDDEN);
    }
}
