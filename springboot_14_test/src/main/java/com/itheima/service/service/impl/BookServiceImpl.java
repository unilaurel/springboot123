package com.itheima.service.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: BookServiceImpl
 * Package: com.itheima.service.service.impl
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 21:39
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;
    @Override
    public boolean save(Book book) {
        return bookDao.insert(book)>0;
    }
}
