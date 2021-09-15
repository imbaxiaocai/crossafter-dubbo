package com.user.service;

import com.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class TestService {
    @Autowired
    private UserDao userDao;
    public void test(){
        String s = "123";
    }
}
