package com.juhao666.orders.controller;

import com.juhao666.orders.services.ProductService;
import com.juhao666.orders.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class OrderListController {

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    @GetMapping("/orders/list")
    public List<String> listAllOrders() {
        log.info("this is /orders/list api info...");
        log.debug("this is /orders/list api debug...");
        log.error("this is /orders/list api error...");
        return Arrays.asList("HUAWEI", "BYD", "XIAOMI", "JUHAO");
    }

    @PostMapping("/order")
    public String addOrder(@RequestParam String userId, @RequestParam String productId) {
        log.info("the user is: {}, the product is: {}", userId, productId);
        String actualUserId = userService.getUser(userId);
        String actualProductId = productService.getProduct(productId);
        return String.format("Order created successfully with product %s for user %s", actualProductId, actualUserId);
    }

}

