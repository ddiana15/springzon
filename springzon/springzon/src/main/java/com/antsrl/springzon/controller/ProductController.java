package com.antsrl.springzon.controller;

import com.antsrl.springzon.model.Description;
import com.antsrl.springzon.model.Product;
import com.antsrl.springzon.service.DescriptionService;
import com.antsrl.springzon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product/{id}")
public class ProductController {
    
    
    @Autowired
    private ProductService service;
    
    @PostMapping("/new")
    public void add(@RequestBody Product stud){
        service.save(stud);
    }
    @GetMapping("/get/{id}")
    public Product read(@PathVariable Long id){
        return service.read(id);
    }
    
    @GetMapping("/getAll")
    public List<Product> readAll(){
        return service.readAll();
    }
    
    @PutMapping("/update")
    public void update(@RequestBody Product stud) {
        service.save(stud);
    }
    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Long id){
        service.delete(id);
    }
    
    
}
