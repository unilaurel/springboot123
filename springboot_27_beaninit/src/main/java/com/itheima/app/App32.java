package com.itheima.app;

import com.itheima.config.SpringConfig32;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: App32
 * Package: com.itheima.app
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 21:27
 * @Version 1.0
 */
public class App32 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig32.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);

        }
    }
}
