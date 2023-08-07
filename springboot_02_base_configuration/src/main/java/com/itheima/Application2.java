package com.itheima;

import com.itheima.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application2 {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application2.class, args);
        BookController bean = ctx.getBean(BookController.class);
        System.out.println("bean====>"+bean);
    }

}
