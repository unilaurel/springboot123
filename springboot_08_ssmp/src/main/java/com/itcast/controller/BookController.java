package com.itcast.controller;

//import cn.itcast.service.IpCountService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itcast.controller.utils.R;
import com.itcast.domain.Book;
import com.itcast.service.IBookService;
import com.itcast.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: BookController
 * Package: com.itcast.controller
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/07 0:22
 * @Version 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    IBookService bookService;


    @GetMapping
    public R getAll() throws IOException {
//        R r = new R();
//        List<Book> list = bookService.list();
//        if (list != null) {
//            r.setFlag(true);
//            r.setData(list);
//        }else {
//            r.setFlag(false);
//        }


        return new R(true,bookService.list());
    }

    @GetMapping("{id}")
    public R getbyId(@PathVariable Integer id) {
//        R r = new R();
//        Book book = bookService.getById(id);
//        if (book != null) {
//            r.setFlag(true);
//            r.setData(book);
//        }else {
//            r.setFlag(false);
//        }
        return new R(true,bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize,Book book) {
//        R r = new R();
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//        if (page != null) {
//            r.setFlag(true);
//            r.setData(page);
//        } else {
//            r.setFlag(false);
//        }

//        System.out.println("参数==》"+book);

        //如果当前页码值大于总页码值，那么重新进行查询操作，使用最大页码值作为当前页码值
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        if(currentPage>page.getPages()){
            page=bookService.getPage((int)page.getPages(),pageSize,book);
        }
        return new R(true,page);

    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        R r = new R();
        boolean b = bookService.removeById(id);
        r.setFlag(b);
        return r;
        
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        R r = new R();
        boolean save = bookService.save(book);
        r.setFlag(save);
        if(book.getName().equals("123")) throw new IOException();
        return new R(save,save?"添加成功！":"添加失败");
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        boolean b = bookService.updateById(book);

        return new R(b,b?"修改成功！":"修改失败！");
    }

}
