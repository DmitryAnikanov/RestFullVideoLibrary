package com.restprojects.videolibrary.controllers;

import com.restprojects.videolibrary.entities.User;
import com.restprojects.videolibrary.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CrudController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/getAllUsers")
    public List<User> getAllUsers() {
        List<User> users = userService.findAll();
        return users;
    }

    /*@RequestMapping("/findUser")
    public void findUser(@RequestParam(value="login") String login) {
        userService.findByLogin(login);
    }*/

    @RequestMapping("/createUser")
    public void createUser() {

    }

    @RequestMapping("/removeUser")
    public void removeUser() {

    }
}
