package com.tanaponjit.cloud.repository;

import org.springframework.data.repository.CrudRepository;

import com.tanaponjit.cloud.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {


}