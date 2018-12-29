package com.tanaponjit.cloud.repository;

import org.springframework.data.repository.CrudRepository;

import com.tanaponjit.cloud.model.SaleOrder;

public interface SaleOrderRepository extends CrudRepository<SaleOrder, Long> {


}