package com.itcast.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * ClassName: MPConfig
 * Package: com.itcast.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/05 23:19
 * @Version 1.0
 */
@Configuration
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //1. 定义MP拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //2. 添加具体拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
