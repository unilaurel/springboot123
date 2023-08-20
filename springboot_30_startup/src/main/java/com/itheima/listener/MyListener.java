package com.itheima.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * ClassName: MyListener
 * Package: com.itheima.listener
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/20 23:45
 * @Version 1.0
 */
public class MyListener implements ApplicationListener<ApplicationStartingEvent> {
////    @Override
//    public void onApplicationEvent(ApplicationEvent event) {
////        System.out.println("===========================================");
////        System.out.println(event.getSource());
////        System.out.println(event.getClass());
////        System.out.println(event.getTimestamp());
////        System.out.println("===========================================");
////    }

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("===========================================");
        System.out.println(event.getSource());
        System.out.println(event.getClass());
        System.out.println(event.getTimestamp());
        System.out.println("===========================================");
    }
}
