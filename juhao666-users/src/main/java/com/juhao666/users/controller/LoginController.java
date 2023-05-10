package com.juhao666.users.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {

    @GetMapping("/users/login")
    public String login() {
        log.info("this is /users/login api info...");
        log.debug("this is /users/login api debug...");
        log.error("this is /users/login api error...");
        return "THIS_IS_LOGIN_ENDPOINTS";
    }
}
