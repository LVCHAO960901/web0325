package com.neuedu.service.user;

import com.neuedu.dao.UserDao;

import com.neuedu.pojo.User;
import com.neuedu.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int batch(List<User> users) {
        return userDao.batch(users);
    }

    @Override
    public Result list(User user) {
        Result result = new Result(userDao.list(user), user.getPageNo(), userDao.count(user), user.getPageSize());
        return result;
    }
}
