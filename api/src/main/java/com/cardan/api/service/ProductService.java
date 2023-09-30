package com.cardan.api.service;

import com.cardan.api.model.Product;
import com.cardan.api.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product findById(int id){
        return productRepository.findProductById(id);
    }
}
