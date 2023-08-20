package com.itcast.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * ClassName: PayEndPoint
 * Package: com.itcast.actuator
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/16 23:33
 * @Version 1.0
 */
@Component
@Endpoint(id = "pay",enableByDefault = true)
public class PayEndPoint {

    @ReadOperation
    public Object getPay(){
        System.out.println("pay-------------------");
        return "pay....";
    }
}
