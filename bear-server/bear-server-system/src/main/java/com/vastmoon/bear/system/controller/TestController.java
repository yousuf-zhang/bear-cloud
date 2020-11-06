package com.vastmoon.bear.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * <p> ClassName: TestController
 * <p> Description: 测试
 *
 * @author yousuf 2020/11/5
 */
@RestController
public class TestController {
    @GetMapping("info")
    public String test(){
        return "bear-server-system";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }
}
