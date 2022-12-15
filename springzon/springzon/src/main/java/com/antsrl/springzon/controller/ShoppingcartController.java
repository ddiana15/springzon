package com.antsrl.springzon.controller;

import com.antsrl.springzon.entity.Shoppingcart;
import com.antsrl.springzon.service.ShoppingcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/shopping")
public class ShoppingcartController {
    @Autowired
    ShoppingcartService shoppingcartService;

    @GetMapping("/all")
    private List<Shoppingcart> all(){
        return shoppingcartService.getAll();
    }
    @GetMapping("/find/{id}")
    private Shoppingcart all(@PathVariable Long id){
        return shoppingcartService.getBy(id);
    }
    @PostMapping("/add")
    private Shoppingcart add(@RequestBody Shoppingcart shoppingcart){
        return shoppingcartService.add(shoppingcart);
    }
    @PutMapping("/update/{id}")
    private Shoppingcart update(@RequestBody Shoppingcart shoppingcart, @PathVariable Long id){
        return shoppingcartService.update(shoppingcart, id);
    }
    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable Long id){
        shoppingcartService.delete(id);
    }
}
