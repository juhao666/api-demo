package com.juhao666.products.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductsPriceController {

    @GetMapping("/products/update")
    public boolean updatePrice(String productId, String price) {
        log.info("this is /product/update API info.....");
        log.debug("this is /product/update API debug.....");
        log.error("this is /product/update API error.....");
        return true;
    }
}
