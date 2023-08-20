package com.itheima.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//import org.springframework.data.redis.core.RedisOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * ClassName: CartoonCatAndMouse
 * Package: com.itheima.bean
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/18 21:10
 * @Version 1.0
 */
@ConditionalOnClass(name="org.springframework.data.redis.core.RedisOperations")
@EnableConfigurationProperties(CartoonProperties.class)
//@ConfigurationProperties(prefix = "cartoon")
@Data
public class CartoonCatAndMouse implements ApplicationContextAware {
    private Cat cat;
    private Mouse mouse;

    private CartoonProperties cartoonProperties;

    public CartoonCatAndMouse(CartoonProperties cartoonProperties  ) {
        this.cartoonProperties=cartoonProperties;
        cat=new Cat();
        mouse=new Mouse();
        cat.setAge(3);
        cat.setName(cartoonProperties.getCat()!=null && StringUtils.hasText(cartoonProperties.getCat().getName())?cartoonProperties.getCat().getName():"tom");
        mouse.setAge(4);
        mouse.setName("Jerry");
    }

    public void play(){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);

        }
        System.out.println(cat.getAge()+"岁的"+cat.getName()+ "和"+mouse.getAge()+"岁的"+mouse.getName()+"打起来了");
    }

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
         this.applicationContext=applicationContext;
    }
}
