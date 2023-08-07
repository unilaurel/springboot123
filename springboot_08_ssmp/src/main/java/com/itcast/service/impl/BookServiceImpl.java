package com.itcast.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itcast.dao.BookDao;
import com.itcast.domain.Book;
import com.itcast.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * ClassName: BookServiceImpl
 * Package: com.itcast.service.impl
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/06 0:58
 * @Version 1.0
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao,Book> implements IBookService {
@Autowired
BookDao bookDao;

    @Override
    public Book getByID(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize,Book book){
        Page<Book> page = new Page<>(currentPage, pageSize);
        QueryWrapper<Book> qwr = new QueryWrapper<>();
        qwr.lambda().like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
        qwr.lambda().like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
        qwr.lambda().like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());

//        LambdaQueryWrapper<Book> qwr = new LambdaQueryWrapper<>();
//        qwr.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
//        qwr.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
//        qwr.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        bookDao.selectPage(page,qwr);
        return page;
    }


}
