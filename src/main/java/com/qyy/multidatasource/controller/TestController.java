package com.qyy.multidatasource.controller;

import com.qyy.multidatasource.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qyhsmx@outlook.com
 * @date
 */
@RestController
public class TestController {
    @Autowired
    private TestService service;

    @GetMapping("test")
    public String test(){
        return service.getUser().toString();
    }
    @GetMapping("insert")
    public String insert(){
        service.insertUser();
        return "success";
    }
}
