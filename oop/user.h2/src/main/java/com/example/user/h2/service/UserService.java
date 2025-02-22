package com.example.user.h2.service;

import com.example.user.h2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public void saveUser(User user);
    public List<User> getAll();
    User getUserById(long id);
    User updateUser(User user, long id);
    void deleteUser(long id);
}
