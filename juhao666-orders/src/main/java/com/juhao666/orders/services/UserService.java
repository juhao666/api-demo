package com.juhao666.orders.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserService {

    @GetMapping("/users/{userId}")
    public String getUser(@PathVariable String userId);
}
