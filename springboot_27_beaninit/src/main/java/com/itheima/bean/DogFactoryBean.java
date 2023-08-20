package com.itheima.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName: DogFactoryBean
 * Package: com.itheima.bean
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 21:10
 * @Version 1.0
 */
public class DogFactoryBean implements FactoryBean<Dog> {
    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }
}
