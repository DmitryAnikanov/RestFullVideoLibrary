package com.restprojects.videolibrary.service;


import com.restprojects.videolibrary.entities.User;
import com.restprojects.videolibrary.repository.UserRepository;
import com.restprojects.videolibrary.service.definition.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(String login, String password) {
        //User user = findUserByLogin(login);
        User user = userRepository.getOne((long) 2);
        if (user!=null) {
            user.setLogin(login);
            user.setPassword(password);
            userRepository.save(user);
        }
        return user;
    }

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

}
