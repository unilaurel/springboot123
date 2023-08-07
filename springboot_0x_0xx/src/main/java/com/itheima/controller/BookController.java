package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: BookController
 * Package: com.itheima.controller
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/02 23:58
 * @Version 1.0
 */

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getById(){
        System.out.println("springboot is runnning...");
        return "springboot is runnning........";
    }
}
