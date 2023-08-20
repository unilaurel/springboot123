package com.itheima.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Component;

/**
 * ClassName: Cat
 * Package: com.itheima.bean
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 23:18
 * @Version 1.0
 */
@Component("tom")
@ConditionalOnBean(name = "jerry")
@ConditionalOnWebApplication
public class Cat {
}
