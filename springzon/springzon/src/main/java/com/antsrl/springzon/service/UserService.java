package com.antsrl.springzon.service;

import com.antsrl.springzon.entity.User;
import com.antsrl.springzon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public User getBy(Long id){
        return userRepository.findUserById(id);
    }
    public User add(User user){
        return userRepository.save(user);
    }
    public User update(User user, Long id){
        if (userRepository.existsById(id)){
            user.setId(id);
            return userRepository.save(user);
        }
        return userRepository.findUserById(id);
    }
    public void delete(Long id){
        User user = userRepository.findUserById(id);

    }
}
