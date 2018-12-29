package com.tanaponjit.cloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanaponjit.cloud.model.Promotion;
import com.tanaponjit.cloud.repository.PromotionRepository;

/**
 * PromotionController
 */
@RestController
@RequestMapping("/promotion")
public class PromotionController {

    @Autowired
    PromotionRepository promotionRepository;

    @GetMapping("/{promotionCode}")
    public Map<String, Object> findByPromotionCode(@PathVariable String promotionCode){
        Promotion promo = promotionRepository.findByCode(promotionCode);
        boolean exists = promo != null;
        Map<String, Object> res = new HashMap<>();
        if(exists){
           res.put("valid", true);
           res.put("discount", promo.getDiscount());
        }else{
            res.put("valid", false);
        }
        return res;
    }
}