package com.itheima.controller;

import com.itheima.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
//    @Autowired
//    Environment env;

    @Autowired
    UserData userData;


    @GetMapping
    public String getById(){
        System.out.println("springboot is runnning2...");
//        System.out.println(env.getProperty("user.port"));
//        System.out.println(env.getProperty("user .address"));
        System.out.println(userData);





        return "springboot is runnning2........";
    }
}
