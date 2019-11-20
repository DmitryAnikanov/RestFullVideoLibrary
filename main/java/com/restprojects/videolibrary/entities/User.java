package com.restprojects.videolibrary.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private boolean isadmin;

    public User() {
    }

    public User(String login, String password, boolean isadmin) {
        this.login = login;
        this.password = password;
        this.isadmin = isadmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isAdmin() {
        return isadmin;
    }

    public void setAdmin(boolean admin) {
        isadmin = admin;
    }

}
