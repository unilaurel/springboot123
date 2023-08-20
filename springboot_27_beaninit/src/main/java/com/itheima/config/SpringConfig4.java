package com.itheima.config;

import com.itheima.bean.Dog;
import com.itheima.bean.Mouse;
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
@Import({Dog.class, Dbconfig.class})
public class SpringConfig4 {
}
