package com.itheima.controller;

import com.itheima.server.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: OrderController
 * Package: com.itheima.controller
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/15 21:42
 * @Version 1.0
 */
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public void order(@PathVariable String id){
        orderService.order(id);
    }
}
