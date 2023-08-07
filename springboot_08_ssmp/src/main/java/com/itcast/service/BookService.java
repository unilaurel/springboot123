package com.itcast.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itcast.domain.Book;

import java.util.List;

/**
 * ClassName: BookService
 * Package: com.itcast.service
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/06 0:25
 * @Version 1.0
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getByPage(int currentPage,int pageSize);


}
