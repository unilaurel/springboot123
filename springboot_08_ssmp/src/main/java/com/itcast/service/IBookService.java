package com.itcast.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ClassName: IBookService
 * Package: com.itcast.service
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/06 0:55
 * @Version 1.0
 */
public interface IBookService extends IService<Book> {

    Book getByID(Integer id);

    IPage<Book> getPage(int currentPage, int pageSize,Book book);

}
