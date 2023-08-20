package com.itheima.bean.service.impl;

import com.itheima.bean.service.BookService;
import org.springframework.stereotype.Service;

/**
 * ClassName: BookServiceImpl
 * Package: com.itheima.bean.service.impl
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/16 23:52
 * @Version 1.0
 */
@Service("bookService")
public class BookServiceImpl1 implements BookService {

    @Override
    public void check() {
        System.out.println("book service impl1");
    }
}
