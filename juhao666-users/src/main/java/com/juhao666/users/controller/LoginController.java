package com.juhao666.users.controller;

import com.alibaba.nacos.common.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {

    @GetMapping("/users/login")
    public String login() {
        log.info("this is /users/login api info...");
        log.debug("this is /users/login api debug...");
        log.error("this is /users/login api error...");
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            log.error("an system error!!!", e);
        }
        return "THIS_IS_LOGIN_ENDPOINTS";
    }

    @GetMapping("/users/{userId}")
    public String getUser(@PathVariable String userId) {
        log.info("check user ID:{}", userId);
        if (StringUtils.equalsIgnoreCase(userId,"000"))
            return null;
        return "JUHAO666_" + userId;
    }
}
