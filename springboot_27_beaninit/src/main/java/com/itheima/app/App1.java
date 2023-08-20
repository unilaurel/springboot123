package com.itheima.app;

import com.itheima.config.SpringConfig3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: App1
 * Package: com.itheima.app
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 21:14
 * @Version 1.0
 */
public class App1 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig3.class);
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);

        }

        System.out.println(ctx.getBean("dog1"));
        System.out.println(ctx.getBean("dog1"));
        System.out.println(ctx.getBean("dog1"));

    }
}
