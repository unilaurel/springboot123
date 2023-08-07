package com.itcast.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itcast.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: BookDaoTestCase
 * Package: com.itcast.dao
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/06 0:40
 * @Version 1.0
 */

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    BookDao bookDao;

    @Test
    public void testGetBy2(){

        String name=null;
        QueryWrapper<Book> wr = new QueryWrapper<>();
        wr.lambda().like(name!=null,Book::getName,name);
        bookDao.selectList(wr);
    }
}
