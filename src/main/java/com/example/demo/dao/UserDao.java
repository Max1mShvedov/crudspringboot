package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void deleteUser(Long id);

}
