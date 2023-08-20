package com.itheima.server.impl;

import com.itheima.server.MessageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * ClassName: MessageServiceImpl
 * Package: com.itheima.server.impl
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/15 21:37
 * @Version 1.0
 */
@Service
public class MessageServiceImpl implements MessageService {
    private ArrayList<String> msglist = new ArrayList<>();
    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已加入队列，id"+id);
        msglist.add(id);
    }

    @Override
    public String doMessage() {
        String id=msglist.remove(0);
        System.out.println("已完成短信发送业务，id"+id);
        return id;
    }
}
