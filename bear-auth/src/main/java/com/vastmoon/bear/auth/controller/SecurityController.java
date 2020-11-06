package com.vastmoon.bear.auth.controller;

import com.vastmoon.common.client.dto.Rest;
import com.vastmoon.common.client.dto.RestBody;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * <p> ClassName: SecurityController
 * <p> Description:
 *
 * @author yousuf 2020/11/4
 */
@RestController
@RequiredArgsConstructor
public class SecurityController {

    private final ConsumerTokenServices consumerTokenServices;

    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }

    @GetMapping("user")
    public Rest<Principal> currentUser(Principal principal) {
        return RestBody.success(principal);
    }

    @DeleteMapping("signout")
    public Rest<String> signout(HttpServletRequest request) {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "Bearer ", "");

        return RestBody.success("退出登录成功");
    }
}
