package com.itheima.service;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.springframework.stereotype.Service;

/**
 * ClassName: BookService
 * Package: com.itheima.service
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 21:38
 * @Version 1.0
 */

public interface BookService  {
    public boolean save(Book book);
}
