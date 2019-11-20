package com.restprojects.videolibrary;

import com.restprojects.videolibrary.entities.User;
import com.restprojects.videolibrary.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class VideolibraryApplication {

    @Autowired
    private UserServiceImpl userService;

    public static void main(String[] args) {
        SpringApplication.run(VideolibraryApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods() {
        /*User user = new User();
        user.setLogin("userTest");
        user.setPassword("passwordTest");
        user.setAdmin(false);
        userService.saveUser(user);
        userService.findAll();*/
       /* User user2 = new User();
        user2.setLogin("admin");
        user2.setPassword("adminPsw");
        user2.setAdmin(true);
        userService.createUser(user2);

        userService.findAll().forEach(record-> System.out.println(record));*/

    }
}
