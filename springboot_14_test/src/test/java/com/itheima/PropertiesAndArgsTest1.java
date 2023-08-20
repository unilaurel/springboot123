package com.itheima;

import com.itheima.testcase.domain.BooKCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: PropertiesAndArgsTest
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 19:42
 * @Version 1.0
 */
@SpringBootTest(properties ={"test.prop=testValue111"},args ={"--test.prop=testValue222"})
public class PropertiesAndArgsTest1 {

    @Autowired
    private BooKCase booKCase;

    @Value("${test.prop}")
    String str;
    @Test
    public void test(){
//        System.out.println(str);
        System.out.println(booKCase);

    }
}
