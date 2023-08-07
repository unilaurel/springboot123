package com.itheima;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: UserData
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/04 22:40
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "userdata")
//1. 定义数据模型封装yaml文件中对应的数据
//2. 定义为Spring管控的bean
//3. 指定要加载的数据
public class UserData {
    private String address;
    private String port;
    private String mydata;
}
