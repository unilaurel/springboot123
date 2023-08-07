package com.itcast.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itcast.domain.Book;
import com.itcast.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
//@RestController
//@RequestMapping("/books")
public class BookController2 {
    @Autowired
    IBookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.list();
    }

    @GetMapping("{id}")
    public Book getbyId(@PathVariable Integer id){
        return bookService.getById(id);
    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//       return bookService.getPage(currentPage,pageSize);
//    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }

    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.updateById(book);
    }

}
