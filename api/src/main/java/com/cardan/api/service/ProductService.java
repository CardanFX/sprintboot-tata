package com.cardan.api.service;

import com.cardan.api.model.Product;
import com.cardan.api.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product findById(int id){
        return productRepository.findById((long)id).get();
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
