package com.antsrl.springzon.controller;

import com.antsrl.springzon.model.Description;
import com.antsrl.springzon.model.ShoppingCart;
import com.antsrl.springzon.service.DescriptionService;
import com.antsrl.springzon.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/description")
public class DescriptionController {
    
        
        @Autowired
        private DescriptionService service;
        
        @PostMapping("/new")
        public void add(@RequestBody Description stud){
            service.save(stud);
        }
        @GetMapping("/get/{id}")
        public Description read(@PathVariable Long id){
            return service.read(id);
        }
        
        @GetMapping("/getAll")
        public List<Description> readAll(){
            return service.readAll();
        }
        
        @PutMapping("/update")
        public void update(@RequestBody Description stud) {
            service.save(stud);
        }
        @DeleteMapping("/delete/{id}")
        public void delete (@PathVariable Long id){
            service.delete(id);
        }
        
    }
