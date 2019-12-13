package com.haku.project.controller;

import com.haku.project.entity.User;
import com.haku.project.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id") Long id){
        User user = this.userService.queryUserById(id);
        return user;
    }

    @GetMapping("/all")
    public List<User> queryAllUsers(){
        List<User> users = this.userService.queryAllUsers();
        return users;
    }

}