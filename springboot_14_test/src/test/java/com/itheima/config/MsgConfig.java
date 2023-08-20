package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MsgConfig
 * Package: com.itheima.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 20:20
 * @Version 1.0
 */
@Configuration
public class MsgConfig {

    @Bean
    public String msg(){
        return "bean msg";
    }
}
