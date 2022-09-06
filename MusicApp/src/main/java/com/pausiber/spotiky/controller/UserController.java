package com.pausiber.spotiky.controller;

import com.pausiber.spotiky.model.User;
import com.pausiber.spotiky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    /*@Autowired
    UserService userService;*/
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username){
       return userService.getUserByUsername(username);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User newUser){
        return userService.updateUser(id,newUser);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}
