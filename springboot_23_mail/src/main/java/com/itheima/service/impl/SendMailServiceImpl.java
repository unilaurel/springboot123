package com.itheima.service.impl;

import com.itheima.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.Message;

/**
 * ClassName: SendMailServiceImpl
 * Package: com.itheima.service.impl
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/14 21:48
 * @Version 1.0
 */
@Service
public class SendMailServiceImpl implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    //发送人
    private String from="unisakurazz@gmail.com";
    //接受人
    private String to="unilaurel@outlook.com";
    //标题
    private String subject = "biaoti";
    //正文
    private String context = "fafa guolai";
    @Override
    public void sendMail() {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(context);
        javaMailSender.send(message);
    }
}
