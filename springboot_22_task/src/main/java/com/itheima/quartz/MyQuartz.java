package com.itheima.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * ClassName: MyQuartz
 * Package: com.itheima.quartz
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/14 21:09
 * @Version 1.0
 */
public class MyQuartz extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("quartz task run...");

    }
}
