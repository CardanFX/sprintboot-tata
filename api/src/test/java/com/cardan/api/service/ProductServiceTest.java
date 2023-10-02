package com.cardan.api.service;

import com.cardan.api.model.Product;
import com.cardan.api.respository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    ProductService productService;

    @Mock
    ProductRepository productRepository;

    @Test
    void testWhenFilter() {
        Product product = new Product();
        product.setId(1L);
        product.setPrice(10);
        when(productRepository.findById(anyLong())).thenReturn(Optional.of(product));
        var prod = productService.findById(1);
        assertEquals(product.getId(),prod.getId());
    }

    @Test
    void testWhenSum() {
        Product product = new Product();
        product.setPrice(10);
        when(productRepository.findAll()).thenReturn(List.of(product,product,product));
        assertEquals(30,productService.calculateTotalPrice());
    }

    @Test
    void testWhenNames() {
        Product product = new Product();
        product.setName("a");
        when(productRepository.findAll()).thenReturn(List.of(product,product,product));
        assertEquals(List.of("a","a","a"),productService.mapProductNames());
    }

    @Test
    void testWhenCategory() {
        Product product = new Product();
        product.setName("a");
        product.setCategoryId(1);

        Product product1 = new Product();
        product1.setName("b");
        product1.setCategoryId(2);

        Product product2 = new Product();
        product2.setName("b");
        product2.setCategoryId(2);
        when(productRepository.findAll()).thenReturn(List.of(product,product1,product2));

        assertEquals(List.of(product),productService.filterProductsByCategory(1));
    }

}
