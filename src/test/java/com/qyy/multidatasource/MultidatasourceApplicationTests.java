package com.qyy.multidatasource;

import com.qyy.multidatasource.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultidatasourceApplicationTests {

    @Autowired
    private TestService service;

    @Test
    public void contextLoads() {
        System.out.println("执行查询----------------");
        service.getUser();
        System.out.println("执行查询----------------");
    }

}
