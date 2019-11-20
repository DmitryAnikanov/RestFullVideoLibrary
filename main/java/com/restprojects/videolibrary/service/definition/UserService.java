package com.restprojects.videolibrary.service.definition;

import com.restprojects.videolibrary.entities.User;

import java.util.List;

public interface UserService {
    User findUserByLogin(String login);
    void saveUser(User note);
    void deleteUser(User user);
    void deleteUserById(Long id);
    User updateUser(String login, String password);
    List<User> findAll();
}
