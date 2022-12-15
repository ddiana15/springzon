package com.antsrl.springzon.controller;

import com.antsrl.springzon.model.ShoppingCart;
import com.antsrl.springzon.model.User;
import com.antsrl.springzon.service.ShoppingCartService;
import com.antsrl.springzon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping-cart/{id}")
public class ShoppingCartController {
    
    @Autowired
    private ShoppingCartService service;
    
    @PostMapping("/new")
    public void add(@RequestBody ShoppingCart stud){
        service.save(stud);
    }
    @GetMapping("/get/{id}")
    public ShoppingCart read(@PathVariable Long id){
        return service.read(id);
    }
    
    @GetMapping("/getAll")
    public List<ShoppingCart> readAll(){
        return service.readAll();
    }
    
    @PutMapping("/update")
    public void update(@RequestBody ShoppingCart stud) {
        service.save(stud);
    }
    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Long id){
        service.delete(id);
    }
    
    
}
