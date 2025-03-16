package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User userDetails);

    void deleteUser(Long id);

    List<User> searchUsersByName(String name);
}