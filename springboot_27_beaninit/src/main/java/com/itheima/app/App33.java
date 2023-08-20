package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.config.SpringConfig32;
import com.itheima.config.SpringConfig33;
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
public class App33 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig33.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------------");
//        System.out.println(context.getBean("springConfig33"));
        SpringConfig33 springConfig33 = context.getBean("springConfig33", SpringConfig33.class);
        System.out.println(springConfig33.cat());
        System.out.println(springConfig33.cat());
        System.out.println(springConfig33.cat());
    }
    
}
