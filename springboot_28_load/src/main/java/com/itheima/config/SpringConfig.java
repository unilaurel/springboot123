package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.bean.Cat;
import com.itheima.bean.Mouse;
import com.itheima.bean.MyImportSelector;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * ClassName: SpringConfig
 * Package: com.itheima.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 23:20
 * @Version 1.0
 */
//@Import(MyImportSelector.class)

//    @Import(Mouse.class)
    @ComponentScan("com.itheima.bean")
public class SpringConfig
{


    @Bean
//    @ConditionalOnClass(Mouse.class)
//    @ConditionalOnMissingClass("com.itheima.bean.Mouse")
//    @ConditionalOnClass(name = "com.itheima.bean.Mouse")
//    @ConditionalOnBean(name = "jerry")
////    @ConditionalOnMissingClass("com.itheima.bean.Dog")
////    @ConditionalOnNotWebApplication
//    @ConditionalOnWebApplication
    public Cat tom(){
        return new Cat();

    }


    @Bean
    @ConditionalOnClass(name = "com.mysql.jdbc.Driver")
    public DruidDataSource dataSource(){
        return new DruidDataSource();
    }
}
