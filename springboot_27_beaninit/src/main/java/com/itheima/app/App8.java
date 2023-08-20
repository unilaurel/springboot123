package com.itheima.app;

import com.itheima.bean.service.BookService;
import com.itheima.bean.service.impl.BookServiceImpl1;
import com.itheima.config.SpringConfig7;
import com.itheima.config.SpringConfig8;
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
public class App8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig8.class);
        context.registerBean("bookService", BookServiceImpl1.class);
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.check();
    }
    
}
