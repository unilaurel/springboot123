package com.itheima.config;

import com.itheima.quartz.MyQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: QuartzConfig
 * Package: com.itheima.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/14 21:11
 * @Version 1.0
 */
@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail printJobDetail(){
        //绑定具体工作
        return JobBuilder.newJob(MyQuartz.class).storeDurably().build();
    }

    @Bean
    public Trigger printJobTrigger(){
        //绑定对应的工作明细
        ScheduleBuilder schebuilder=CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(printJobDetail()).withSchedule(schebuilder).build();
    }
}
