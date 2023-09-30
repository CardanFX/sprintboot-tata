package com.cardan.api.controller;
import com.cardan.api.model.Product;
import com.cardan.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping
    private String create(){
        return "post";
    }
    @GetMapping
    public String read(){
        return "get";
    }
    @PutMapping
    public String update(){
        return "put";
    }
    @DeleteMapping
    public String delete(){
        return "del";
    }

    @PostMapping("/create")
    public Product createProduct (@RequestBody Product product){
        return product;
    }

    @GetMapping("/path/{id}")
    public Product getProductByPathVariable(@PathVariable int id){
        return productService.findById(id);
    }

    @GetMapping("/parameter")
    public Product getProductByParameter(@RequestParam int id){
        return productService.findById(id);
    }
}


