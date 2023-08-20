package com.itheima.controller;

import com.itheima.server.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: MessageController
 * Package: com.itheima.controller
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/15 21:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/msgs")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping
    public String doMessage(){
        String id = messageService.doMessage();
        return id;
    }
}
