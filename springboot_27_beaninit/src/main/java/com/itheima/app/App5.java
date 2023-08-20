package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Dog;
import com.itheima.bean.Mouse;
import com.itheima.config.SpringConfig4;
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
public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig4.class);
        context.registerBean("tom", Cat.class,0);
        context.registerBean("tom", Cat.class,1);
        context.registerBean("tom", Cat.class,2);

        context.register(Mouse.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-------------------");
        System.out.println(context.getBean(Cat.class));
    }
    
}
