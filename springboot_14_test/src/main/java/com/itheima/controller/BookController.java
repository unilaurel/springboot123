package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: BookController
 * Package: com.itheima.controller
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 20:35
 * @Version 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {

//    @GetMapping
//    public String getById(){
//        System.out.println("getById is running....");
//        return "springboot2";
//    }

    @GetMapping
    public Book getById(){
        Book book = new Book();
        book.setId(121);
        book.setType("it");
        book.setName("MySQL");
        book.setDescription("fafa  guolai");
        return book;
    }
}
