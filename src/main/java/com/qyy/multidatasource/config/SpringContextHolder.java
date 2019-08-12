package com.qyy.multidatasource.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author qyhsmx@outlook.com
 * @date
 */
@Component
public class SpringContextHolder implements ApplicationContextAware {
    private  static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext  = applicationContext;
    }
    public  static Object getBean(String name){
        if(applicationContext==null){
            System.out.println("applicationContext是空的");
        }
        return applicationContext.getBean(name);
    }
}
