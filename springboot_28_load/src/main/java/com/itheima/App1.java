package com.itheima;

import com.itheima.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: App1
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 23:19
 * @Version 1.0
 */
public class App1 {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);

        }
    }

}
