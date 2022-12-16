package com.antsrl.springzon.service;

import com.antsrl.springzon.entity.Shoppingcart;
import com.antsrl.springzon.repository.ProductRepository;
import com.antsrl.springzon.repository.ShoppingcartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingcartService {
    @Autowired
    ShoppingcartRepository shoppingcartRepository;
    @Autowired
    ProductRepository productRepository;
    public List<Shoppingcart> getAll(){
        return shoppingcartRepository.findAll();
    }
    public Shoppingcart getBy(Long id){
        return shoppingcartRepository.findShoppingcartById(id);
    }
    public Shoppingcart add(Shoppingcart shoppingcart){
        return shoppingcartRepository.save(shoppingcart);
    }
    public Shoppingcart update(Shoppingcart shoppingcart, Long id){
        if (shoppingcartRepository.existsById(id)){
            shoppingcart.setId(id);
            return shoppingcartRepository.save(shoppingcart);
        }
        return shoppingcartRepository.findShoppingcartById(id);
    }
    public void delete(Long id){
        Shoppingcart shoppingcart = shoppingcartRepository.findShoppingcartById(id);
        shoppingcartRepository.delete(shoppingcart);
    }
    public void addinto(Long prodid, Long cartid){
        if(shoppingcartRepository.existsById(cartid)||productRepository.existsById(prodid))
            shoppingcartRepository.insert(prodid, cartid);
    }
    public void remover(Long prodid, Long cartid){
        if(shoppingcartRepository.existsById(cartid)||productRepository.existsById(prodid))
            shoppingcartRepository.remove(prodid, cartid);

    }
    public void wipe(Long cartid){
        shoppingcartRepository.wipe(cartid);
    }


}
