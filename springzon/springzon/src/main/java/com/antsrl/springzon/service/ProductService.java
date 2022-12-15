package com.antsrl.springzon.service;

import com.antsrl.springzon.model.Product;
import com.antsrl.springzon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository rep;
    
    public void save(Product u) {
        rep.save(u);
    }
    
    public Product read(Long id) {
        Optional<Product> s = rep.findById(id);
        Product stud = s.isPresent() ? s.get() : null;
        
        return stud;
    }
    
    public List<Product> readAll() {
        return rep.findAll();
    }
    
    public Product readnew(Long id) {
        List<Product> stud = readAll();
        Product tmp = null;
        for(int i=0; i<stud.size(); i++)
            if(id == stud.get(i).getId())
                tmp=stud.get(i);
        return tmp;
        
    }
    
    public void delete(Long id) {
        rep.deleteById(id);
    }
    
    
}


