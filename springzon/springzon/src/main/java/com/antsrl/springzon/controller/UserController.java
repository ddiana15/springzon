package com.antsrl.springzon.controller;

import com.antsrl.springzon.entity.User;
import com.antsrl.springzon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/tutti")
    public List<User> getListaUtenti (){
        return userService.getAll();
    }

    @PostMapping("/add")
    public void aggiungi(@RequestBody User user){
        userService.add(user);

    }

}
