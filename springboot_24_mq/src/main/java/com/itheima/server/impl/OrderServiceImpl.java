package com.itheima.server.impl;

import com.itheima.server.MessageService;
import com.itheima.server.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: OrderServiceImpl
 * Package: com.itheima.server.impl
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/15 21:35
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private MessageService messageService;
    @Override
    public void order(String id) {
        System.out.println("订单处理开始");
        //短信处理
        messageService.sendMessage(id);
        System.out.println("订单处理结束");
    }
}
