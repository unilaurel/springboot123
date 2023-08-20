package com.itheima.config;

import com.itheima.bean.MyPostProcessor;
import com.itheima.bean.MyRegistrar;
import com.itheima.bean.MyRegistrar2;
import com.itheima.bean.service.impl.BookServiceImpl1;
import org.springframework.context.annotation.Import;

/**
 * ClassName: SpringConfig8
 * Package: com.itheima.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 22:30
 * @Version 1.0
 */
@Import({MyPostProcessor.class,BookServiceImpl1.class, MyRegistrar2.class, MyRegistrar.class})
public class SpringConfig8 {
}
