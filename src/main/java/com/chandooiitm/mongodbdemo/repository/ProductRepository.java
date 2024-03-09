package com.chandooiitm.mongodbdemo.repository;

import com.chandooiitm.mongodbdemo.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String > {

}