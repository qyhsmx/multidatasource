package com.qyy.multidatasource.service;

import com.qyy.multidatasource.dao.TestDao;
import com.qyy.multidatasource.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qyhsmx@outlook.com
 * @date
 */
@Service
@Slf4j
public class TestService {

    @Autowired
    private TestDao testDao;

    public User getUser(){
        return testDao.getUser(1);
    }

    public void insertUser(){
        User user = new User(2, "c#");
        testDao.insertUser(user);
    }
}
