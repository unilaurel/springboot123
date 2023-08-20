package com.itheima;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: DaoTest
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 21:41
 * @Version 1.0
 */
@SpringBootTest
@Transactional
@Rollback(true)
public class DaoTest {
    @Autowired
    BookService bookService;
    @Test
    public void testSave(){
        Book book = new Book();
        book.setType("it6");
        book.setName("MySQL6");
        book.setDescription("fafa  guolai");
        bookService.save(book);
    }
}
