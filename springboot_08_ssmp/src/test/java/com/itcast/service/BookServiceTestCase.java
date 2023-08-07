package com.itcast.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: BookServiceTestCase
 * Package: com.itcast.service
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/06 0:43
 * @Version 1.0
 */
@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    BookService bookService;

    @Test
    public void testGetById(){
        System.out.println(bookService.getById(4));
    }

    @Test
    public void testGetPage(){
        bookService.getByPage(3, 2);
    }
}
