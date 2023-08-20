package com.itheima.config;

import com.itheima.bean.Dog;
import com.itheima.bean.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: SpringConfig3
 * Package: com.itheima.bean.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 21:12
 * @Version 1.0
 */
@ComponentScan({"com.itheima.bean","com.itheima.config"})
public class SpringConfig3 {
    @Bean
    public DogFactoryBean dog1(){
        return new DogFactoryBean();
    }
}
