package com.juhao666.orders.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class OrderListController {

    @GetMapping("/orders/list")
    public List<String> listAllOrders() {
        log.info("this is /orders/list api info...");
        log.debug("this is /orders/list api debug...");
        log.error("this is /orders/list api error...");
        return Arrays.asList("HUAWEI", "BYD", "XIAOMI", "JUHAO");
    }
}

