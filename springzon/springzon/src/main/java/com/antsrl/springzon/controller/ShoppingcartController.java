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
    public List<Shoppingcart> all(){
        return shoppingcartService.getAll();
    }
    @GetMapping("/find/{id}")
    public Shoppingcart all(@PathVariable Long id){
        return shoppingcartService.getBy(id);
    }
    @PostMapping("/add")
    public Shoppingcart add(@RequestBody Shoppingcart shoppingcart){
        return shoppingcartService.add(shoppingcart);
    }
    @PutMapping("/update/{id}")
    public Shoppingcart update(@RequestBody Shoppingcart shoppingcart, @PathVariable Long id){
        return shoppingcartService.update(shoppingcart, id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        wipe(id);
        shoppingcartService.delete(id);
    }
    @PostMapping("/insert/{pro_id}/{cart_id}")
    public void insert(@PathVariable Long pro_id, @PathVariable Long cart_id){
        shoppingcartService.addinto(cart_id, pro_id);
    }
    @DeleteMapping("/remove/{pro_id}/{cart_id}")
    public void remove(@PathVariable Long pro_id, @PathVariable Long cart_id){
        shoppingcartService.remover(pro_id, cart_id);
    }
    @DeleteMapping("/wipe/{id}")
    public void wipe(@PathVariable Long id){
        shoppingcartService.wipe(id);
    }
}
