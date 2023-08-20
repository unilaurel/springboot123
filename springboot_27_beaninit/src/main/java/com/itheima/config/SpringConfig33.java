package com.itheima.config;

import com.itheima.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * ClassName: SpringConfig32
 * Package: com.itheima.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 21:27
 * @Version 1.0
 */

@Configuration(proxyBeanMethods = true)
public class SpringConfig33 {

//    @Bean
    public Cat cat(){
        return new Cat();

    }
}
