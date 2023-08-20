package cn.itcast.autoconfig;

import cn.itcast.properties.IpProperties;
import cn.itcast.properties.TestValue;
import cn.itcast.service.IpCountService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ClassName: IpAutoConfiguration
 * Package: cn.itcast.autoconfig
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/19 21:26
 * @Version 1.0
 */
@EnableScheduling
//@EnableConfigurationProperties(IpProperties.class)
//@Import(TestValue.class)
@Import(IpProperties.class)
public class IpAutoConfiguration {
    @Bean
    public IpCountService ipCountService(){
        return new IpCountService();
    }
}
