package com.antsrl.springzon.service;

import com.antsrl.springzon.entity.User;
import com.antsrl.springzon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();

    }

    public void add(User user){
        userRepository.save(user);
    }

}
