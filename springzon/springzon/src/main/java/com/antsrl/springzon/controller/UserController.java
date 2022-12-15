package com.antsrl.springzon.controller;

import com.antsrl.springzon.model.User;
import com.antsrl.springzon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/{id}")
public class UserController {
        
        @Autowired
        private UserService service;
        
        @PostMapping("/new")
        public void add(@RequestBody User stud){
            service.save(stud);
        }
        @GetMapping("/get/{id}")
        public User read(@PathVariable Long id){
            return service.read(id);
        }
        
        @GetMapping("/getAll")
        public List<User> readAll(){
            return service.readAll();
        }
        
        @PutMapping("/update")
        public void update(@RequestBody User stud) {
            service.save(stud);
        }
        @DeleteMapping("/delete/{id}")
        public void delete (@PathVariable Long id){
            service.delete(id);
        }
        
    }
