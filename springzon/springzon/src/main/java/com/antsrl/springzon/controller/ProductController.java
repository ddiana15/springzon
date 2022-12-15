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
    private List<Product> all(){
        return productService.getAll();
    }
    @GetMapping("/find/{id}")
    private Product all(@PathVariable Long id){
        return productService.getBy(id);
    }
    @PostMapping("/add")
    private Product add(@RequestBody Product product){
        return productService.add(product);
    }
    @PutMapping("/update/{id}")
    private Product update(@RequestBody Product product, @PathVariable Long id){
        return productService.update(product, id);
    }
    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable Long id){
        productService.delete(id);
    }
}
