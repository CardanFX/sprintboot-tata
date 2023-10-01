package com.cardan.api.service;

import com.cardan.api.model.Product;
import com.cardan.api.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    private List<Product> findWhenPriceIsMoreThan(int qty) {
        return productRepository.findAll().stream()
                .filter(product -> product.getQty() > qty)
                .toList();
    }

    public List<Product> filterProductsByCategory(int category) {
        return productRepository.findAll().stream()
                .filter(product -> product.getCategoryId() == category)
                .collect(Collectors.toList());
    }

    public List<String> mapProductNames() {
        return productRepository.findAll().stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public double calculateTotalPrice() {
        return productRepository.findAll().stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
