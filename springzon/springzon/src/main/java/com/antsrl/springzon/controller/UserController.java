package com.antsrl.springzon.controller;

import com.antsrl.springzon.entity.User;
import com.antsrl.springzon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all")
    private List<User> all(){
        return userService.getAll();
    }
    @GetMapping("/find/{id}")
    private User all(@PathVariable Long id){
        return userService.getBy(id);
    }
    @PostMapping("/add")
    private User add(@RequestBody User user){
        return userService.add(user);
    }
    @PutMapping("/update/{id}")
    private User update(@RequestBody User user, @PathVariable Long id){
        return userService.update(user, id);
    }
}
