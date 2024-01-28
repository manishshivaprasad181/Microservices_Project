package com.Project.Productservice.repository;

import com.Project.Productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product, String> {
}
