package com.itheima.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyBean
 * Package: com.itheima.quartz
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/14 21:21
 * @Version 1.0
 */
@Component
public class MyBean {

    @Scheduled(cron = "0/1 * * * * ?")
    public void print() {
        System.out.println("springboot task is runnning...");
    }
}
