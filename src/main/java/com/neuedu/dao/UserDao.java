package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface UserDao {
    User login(User user);
    int add(User user);
    int batch(List<User> users);
    List<User> list(User user);
    int count(User user);
}
