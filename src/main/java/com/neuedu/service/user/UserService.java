package com.neuedu.service.user;

import com.neuedu.pojo.User;
import com.neuedu.util.Result;

import java.util.List;

public interface UserService {
    User login(User user);
    int add(User user);
    int batch(List<User> users);
    Result list(User user);
}
