package com.cardan.api.respository;

import com.cardan.api.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public Product findProductById(int id){
        var product = new Product();
        product.setId(id);
        product.setQty(10*id);
        return product;

    }
}
