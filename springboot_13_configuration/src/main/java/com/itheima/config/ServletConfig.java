package com.itheima.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * ClassName: ServletConfig
 * Package: com.itheima.config
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/09 21:55
 * @Version 1.0
 */
@Data
//@Component
//2. 开启对当前Bean的属性校验
@Validated
@ConfigurationProperties(prefix = "servers")
public class ServletConfig {
    private String ipAddress;

    //3. 设置具体的规则
    @Max(value = 8888,message = "最大不能超8888")
    private int port;
    private long timeout;

    @DurationUnit(ChronoUnit.HOURS)
    private Duration serverTimeOut;

    @DataSizeUnit(DataUnit.GIGABYTES)
    private DataSize dataSize;
}
