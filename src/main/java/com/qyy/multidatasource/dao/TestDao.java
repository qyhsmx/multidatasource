package com.qyy.multidatasource.dao;

import com.qyy.multidatasource.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qyhsmx@outlook.com
 * @date
 */
@Mapper
public interface TestDao {
    User getUser(int i);

    void insertUser(User user);
}
