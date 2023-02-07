package com.training.teacher.controller;
import com.training.teacher.model.User;
import com.training.teacher.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getall")
    public List<User>getAll(){
        return userService.getAll();
    }
    @PostMapping("/save")
//    public User addUser(@RequestBody User user){
//
//        return userService.addUser(user);
//    }
    @PutMapping("/edit")
//    public User editUser(@RequestBody User user){
//        return userService.updateUser(user);
//    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}
