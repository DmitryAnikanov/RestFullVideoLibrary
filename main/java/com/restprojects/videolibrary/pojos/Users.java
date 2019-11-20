package com.restprojects.videolibrary.pojos;

import com.restprojects.videolibrary.entities.User;

public class Users {

    private final User user;

    public Users(User user) {
        this.user = user;

    }

    public User getUser() {
        return user;
    }

}
