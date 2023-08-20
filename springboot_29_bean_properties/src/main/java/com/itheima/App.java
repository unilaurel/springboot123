package com.itheima;

import com.itheima.bean.CartoonCatAndMouse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * ClassName: App
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/18 21:07
 * @Version 1.0
 */
@SpringBootApplication

//@Import(CartoonCatAndMouse.class)
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class);
        ctx.getBean(CartoonCatAndMouse.class).play();
        System.out.println(" 你好吗大傻子");
    }
}
