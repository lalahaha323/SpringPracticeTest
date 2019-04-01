package com.demo.impl;

import com.demo.dao.UserDao;
import com.demo.service.UserService;

public class UserServicelmpl implements UserService {
    private UserDao userDao;

    public UserServicelmpl(UserDao userDao) {
        this.userDao = userDao;
    }


    public void login() {
        userDao.login();
    }

}
