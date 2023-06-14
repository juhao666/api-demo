package com.juhao666.products.controller;


import com.alibaba.nacos.common.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/products/{productId}")
    public String getProduct(@PathVariable String productId) {
        log.info("check product ID:{}", productId);
        if (StringUtils.equalsIgnoreCase(productId, "000"))
            return null;
        return "JUHAO666_" + productId;
    }
}
