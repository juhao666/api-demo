package com.juhao666.orders.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductService {

    @GetMapping("/products/{productId}")
    public String getProduct(@PathVariable String productId);
}
