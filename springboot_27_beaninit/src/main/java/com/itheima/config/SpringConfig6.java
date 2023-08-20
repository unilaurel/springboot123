package com.itheima.config;

import com.itheima.bean.Dog;
import com.itheima.bean.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ClassName: SpringConfig4
 * Package: com.itheima.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 21:50
 * @Version 1.0
 */
@Import({MyImportSelector.class})
@ComponentScan(basePackages = "com.itheima")
@Configuration
public class SpringConfig6 {
}
