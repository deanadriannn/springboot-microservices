package com.techie_microservices.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.techie_microservices.product.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
  
}
