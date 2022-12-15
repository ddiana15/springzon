package com.antsrl.springzon.service;

import com.antsrl.springzon.model.Description;
import com.antsrl.springzon.model.ShoppingCart;
import com.antsrl.springzon.repository.DescriptionRepository;
import com.antsrl.springzon.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescriptionService {
    
    
    
    @Autowired
    private DescriptionRepository rep;
    
    public void save(Description u) {
        rep.save(u);
    }
    
    public Description read(Long id) {
        Optional<Description> s = rep.findById(id);
        Description stud = s.isPresent() ? s.get() : null;
        
        return stud;
    }
    
    public List<Description> readAll() {
        return rep.findAll();
    }
    
    public Description readnew(Long id) {
        List<Description> stud = readAll();
        Description tmp = null;
        for(int i=0; i<stud.size(); i++)
            if(id == stud.get(i).getId())
                tmp=stud.get(i);
        return tmp;
        
    }
    
    public void delete(Long id) {
        rep.deleteById(id);
    }
    
    
}
