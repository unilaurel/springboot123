package com.itheima;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ClassName: TimerTaskApp
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/14 20:58
 * @Version 1.0
 */
public class TimerTaskApp {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer task run...");
            }
        };
        timer.schedule(task,0,5000);
    }
 
}
