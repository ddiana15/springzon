package com.antsrl.springzon.service;

import com.antsrl.springzon.model.User;
import com.antsrl.springzon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository rep;
    
    public void save(User u) {
        rep.save(u);
    }
    
    public User read(Long id) {
        Optional<User> s = rep.findById(id);
        User stud = s.isPresent() ? s.get() : null;
        
        return stud;
    }
    
    public List<User> readAll() {
        return rep.findAll();
    }
    
    public User readnew(Long id) {
        List<User> stud = readAll();
        User tmp = null;
        for(int i=0; i<stud.size(); i++)
            if(id == stud.get(i).getId())
                tmp=stud.get(i);
        return tmp;
        
    }
    
    public void delete(Long id) {
        rep.deleteById(id);
    }
    
    
}

