package com.antsrl.springzon.controller;

import com.antsrl.springzon.entity.Product;
import com.antsrl.springzon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public List<Product> all(){
        return productService.getAll();
    }
    @GetMapping("/find/{id}")
    public Product all(@PathVariable Long id){
        return productService.getBy(id);
    }
    @PostMapping("/add")
    public Product add(@RequestBody Product product){
        return productService.add(product);
    }
    @PutMapping("/update/{id}")
    public Product update(@RequestBody Product product, @PathVariable Long id){
        return productService.update(product, id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }
}
