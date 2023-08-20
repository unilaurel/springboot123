package com.itheima;

import com.itheima.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * ClassName: ConfigTest
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 20:22
 * @Version 1.0
 */
@SpringBootTest
@Import(MsgConfig.class)
public class ConfigTest {
    @Autowired
    private String mmm;

    @Test
    public void testConfig(){
        System.out.println(mmm);
    }
}
