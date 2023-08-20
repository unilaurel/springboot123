package cn.itcast.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: SpringMVCConfig
 * Package: com.itcast.controller.interceptor
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/19 23:21
 * @Version 1.0
 */
@Configuration
public class SpringMVCConfig implements WebMvcConfigurer {
    @Bean
    public IpCountInterceptor ipCountInterceptor(){
        return new IpCountInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(ipCountInterceptor()).addPathPatterns("/**");
    }
}
