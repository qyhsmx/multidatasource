package com.qyy.multidatasource.entity;

import lombok.Data;

/**
 * @author qyhsmx@outlook.com
 * @date
 */
@Data
public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }


}
