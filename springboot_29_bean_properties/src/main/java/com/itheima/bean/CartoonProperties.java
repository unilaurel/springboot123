package com.itheima.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: CartoonProperties
 * Package: com.itheima.bean
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/18 21:26
 * @Version 1.0
 */
//@Component
@Data
@ConfigurationProperties(prefix = "cartoon")
public class CartoonProperties  {
    private Cat cat;
    private Mouse mouse;
}
