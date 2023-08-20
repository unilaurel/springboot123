package com.itheima.testcase.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: BooKCase
 * Package: com.itheima.testcase.domain
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/11 0:08
 * @Version 1.0
 */
@Component
@Data
@ConfigurationProperties(prefix = "testcase.book")
public class BooKCase {
    private int id;
    private String name;
    private String uuid;
    private long publishTime;
}
