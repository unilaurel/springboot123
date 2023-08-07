package com.itcast.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itcast.dao.BookDao;
import com.itcast.domain.Book;
import com.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BookServiceImpl
 * Package: com.itcast.service
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/06 0:28
 * @Version 1.0
 */
@Service
public class BookServiceImpl2 implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book)>0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> getByPage(int currentPage, int pageSize) {
        return bookDao.selectPage(new Page<>(currentPage,pageSize),null);
    }
}
