package com.itheima.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: Cat
 * Package: com.itheima.bean
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/16 23:50
 * @Version 1.0
 */
//@Configuration
@ComponentScan
public class Cat {
    public Cat() {
    }

    int age;

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
