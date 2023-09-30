package com.cardan.api.service;

import com.cardan.api.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public Product findById(int id){
        var product = new Product();
        product.setId(id);
        product.setQty(10*id);
        return product;
    }
}
