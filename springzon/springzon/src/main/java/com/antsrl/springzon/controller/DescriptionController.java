package com.antsrl.springzon.controller;

import com.antsrl.springzon.entity.Description;
import com.antsrl.springzon.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/description")
public class DescriptionController {
    @Autowired
    DescriptionService descriptionService;
    @GetMapping("/all")
    public List<Description> all(){
        return descriptionService.getAll();
    }
    @GetMapping("/find/{id}")
    public Description all(@PathVariable Long id){
        return descriptionService.getBy(id);
    }
    @PostMapping("/add")
    public Description add(@RequestBody Description description){
        return descriptionService.add(description);
    }
    @PutMapping("/update/{id}")
    public Description update(@RequestBody Description description, @PathVariable Long id){
        return descriptionService.update(description, id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        descriptionService.delete(id);
    }
    
}
