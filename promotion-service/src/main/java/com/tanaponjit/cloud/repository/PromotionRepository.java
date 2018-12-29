package com.tanaponjit.cloud.repository;
import org.springframework.data.repository.CrudRepository;

import com.tanaponjit.cloud.model.Promotion;

public interface PromotionRepository extends CrudRepository<Promotion, Long> {
    Promotion findByCode(String code);
}
