package com.restprojects.videolibrary.repository;

import com.restprojects.videolibrary.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//public interface UserRepository extends CrudRepository<User, Long> {
    /*@Query("select u from User")
    List<User> getAllUsers();*/
    //List<User> findAll();
   // @Query("select u from users u")

    @Query(value = "SELECT u FROM User u WHERE u.login = :login")
    public User findByLogin(@Param("login") String login);

}
