package com.chandooiitm.mongodbdemo.service;

import com.chandooiitm.mongodbdemo.entity.Product;
import com.chandooiitm.mongodbdemo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product data) {
        return productRepository.save(data);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).get();
        //Add object mapping here using mapstruc dependency
        Product updatedProduct = productRepository.save(existingProduct);
        return updatedProduct;
    }

    public String deleteProduct(String id) {
        productRepository.deleteById(id);
        return "data removed !! " + id;
    }

}