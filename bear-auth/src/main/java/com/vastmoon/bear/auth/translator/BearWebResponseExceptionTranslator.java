package com.vastmoon.bear.auth.translator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.DefaultWebResponseExceptionTranslator;
import org.springframework.stereotype.Component;

/**
 * <p> ClassName: BearWebResponseExceptionTranslator
 * <p> Description: 认证失败
 *
 * @author yousuf 2020/11/5
 */
@Slf4j
@Component
public class BearWebResponseExceptionTranslator extends DefaultWebResponseExceptionTranslator {
    @Override
    public ResponseEntity<OAuth2Exception> translate(Exception e) throws Exception {
        ResponseEntity<OAuth2Exception> responseEntity = super.translate(e);
        CustomOAuth2Exception exception = new CustomOAuth2Exception(e.getMessage(), e);
        return new ResponseEntity<>(exception, responseEntity.getHeaders(), responseEntity.getStatusCode());
    }
}
