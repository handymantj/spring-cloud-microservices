package com.tanaponjit.cloud.controller;

import java.util.HashMap;
import java.util.Map;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController()
@RequestMapping("/order")
public class SaleOrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SaleOrderController.class);

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getPromotionFallback")
    @GetMapping("/setPromotion/{id}/{promotionCode}")
    public Map<String, String> findOrderById(
        @PathVariable Long id,
        @PathVariable String promotionCode
    ) {
        LOGGER.info("call to promotion service");
        @SuppressWarnings("unchecked")
        Map<String, String> promotion = restTemplate.getForObject("http://promotion-service/promotion"+promotionCode, Map.class);
        LOGGER.info("response from promotion");
        return promotion;
    }

    public Map<String, String> getPromotionFallback(Long id, String promotionCode, Throwable hystrixCommand) {
        Map<String, String> result = new HashMap<>();
        System.out.println(hystrixCommand.getMessage());
        result.put("success", "false");
        result.put("message", hystrixCommand.getMessage());
        return result;
    }
}