package com.itcast.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itcast.domain.Book;
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
public class BookServiceTest {
    @Autowired
    IBookService bookService;

    @Test
    public void testGetById() {

        System.out.println(bookService.getById(4));
    }

    @Test
    public void testGetPage() {
        bookService.page(new Page<Book>(2, 4));
    }

    @Test
    public void testGetByID(){//自己定义的方法
        bookService.getById(10);
        bookService.removeById(5);

    }
}


