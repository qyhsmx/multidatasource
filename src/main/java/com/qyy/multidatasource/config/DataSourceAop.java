package com.qyy.multidatasource.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author qyhsmx@outlook.com
 * @date
 */
@Aspect
@Component
@Slf4j
public class DataSourceAop {

    @Before("execution(* com.qyy.multidatasource.dao..*.find*(..)) || execution(* com.qyy.multidatasource.dao..*.get*(..))")
    public void setReadDataSourceType() {
        DataSourceContextHolder.read();
        log.info("dataSource切换到：Read");
    }

    @Before("execution(* com.qyy.multidatasource.dao..*.insert*(..)) || execution(* com.qyy.multidatasource.dao..*.update*(..))")
    public void setWriteDataSourceType() {
        DataSourceContextHolder.write();
        log.info("dataSource切换到：write");
    }

}
