package com.cardan.api.controller;
import com.cardan.api.model.Product;
import com.cardan.api.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
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

    @GetMapping("path/{id}")
    public Product getProductByPathVariable(@PathVariable int id){
        var product = new Product();
        product.setId(id);
        product.setQty(id*2);
        return product;
    }

    @GetMapping("parameter")
    public Product getProductByParameter(@RequestParam int id){
        var product = new Product();
        product.setId(id);
        product.setQty(id*2);
        return product;
    }
}


