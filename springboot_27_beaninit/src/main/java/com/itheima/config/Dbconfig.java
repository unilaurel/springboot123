package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: Dbconfig
 * Package: com.itheima.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 21:56
 * @Version 1.0
 */
//@Configuration
public class Dbconfig {
    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        return ds;
    }
}
