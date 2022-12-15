package com.antsrl.springzon.service;

import com.antsrl.springzon.model.Product;
import com.antsrl.springzon.model.ShoppingCart;
import com.antsrl.springzon.repository.ProductRepository;
import com.antsrl.springzon.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartService {
    
    
    @Autowired
    private ShoppingCartRepository rep;
    
    public void save(ShoppingCart u) {
        rep.save(u);
    }
    
    public ShoppingCart read(Long id) {
        Optional<ShoppingCart> s = rep.findById(id);
        ShoppingCart stud = s.isPresent() ? s.get() : null;
        
        return stud;
    }
    
    public List<ShoppingCart> readAll() {
        return rep.findAll();
    }
    
    public ShoppingCart readnew(Long id) {
        List<ShoppingCart> stud = readAll();
        ShoppingCart tmp = null;
        for(int i=0; i<stud.size(); i++)
            if(id == stud.get(i).getId())
                tmp=stud.get(i);
        return tmp;
        
    }
    
    public void delete(Long id) {
        rep.deleteById(id);
    }
    
    
}
