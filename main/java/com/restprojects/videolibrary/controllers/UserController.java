package com.restprojects.videolibrary.controllers;

import com.restprojects.videolibrary.entities.User;
import com.restprojects.videolibrary.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    public UserController() {

    }

    @RequestMapping("/saveUser")
    public void saveUser(@RequestParam String login, @RequestParam String password, boolean isAdmin) {
        User user = new User(login, password, isAdmin);
        userService.saveUser(user);
    }

    @RequestMapping("/getAllUsersUser")
    public List<User> getAllUsersUser() {
       return  userService.findAll();
    }

    @RequestMapping("/deleteUserById")
        public void deleteUserById(@RequestParam Long id) {
          userService.deleteUserById(id);
    }

    @RequestMapping("/findUser")
    public User findUser(@RequestParam String login) {
        return userService.findUserByLogin(login);
    }

    @RequestMapping("/updateUser")
    public User updateUser(@RequestParam String login, @RequestParam String password) {
        return userService.updateUser(login, password);
    }
}
