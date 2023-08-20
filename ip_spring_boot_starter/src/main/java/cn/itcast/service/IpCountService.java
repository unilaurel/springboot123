package cn.itcast.service;

import cn.itcast.properties.IpProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: IpCountService
 * Package: cn.itcast.service
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/19 21:13
 * @Version 1.0
 */
public class IpCountService {
    private Map<String, Integer> ipCountMap = new HashMap<>();

    @Autowired
    //当前request对象的注入工作由使用当前starter的工程提供自动装配
    private HttpServletRequest httpServletRequest;

    public void count() {
        //每次调用当前操作就记录当前访问的IP，然后累加次数
        //1. 获取当前的IP地址，
        String ip = httpServletRequest.getRemoteAddr();
        //2。 根据IP地址从Map区值并递增
        Integer count = ipCountMap.get(ip);
        if (count != null) {
            ipCountMap.put(ip, count + 1);
        } else {
            ipCountMap.put(ip, 1);
        }
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ip+"---"+count);
    }


    @Autowired
    private IpProperties ipProperties;

    @Scheduled(cron = "0/#{ipProperties.cycle} * * * * ?")
    public void print() {

        System.out.println("===========IP访问监控=========");
        if (ipProperties.getModel().equals(IpProperties.LogModel.DETAIL.getValue())) {
            System.out.println("+-----ip-address-----+--num--+");
            for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(String.format("|%18s  |%5d  |", key, value));
            }
        } else if (ipProperties.getModel().equals(IpProperties.LogModel.SIMPLE.getValue())) {
            System.out.println("+-----ip-address-----+");
            for (String key : ipCountMap.keySet()) {
                System.out.println(String.format("|%18s  |", key));
            }
            System.out.println("+--------------------+");
        }
        if (ipProperties.isCycleReset()) {
            ipCountMap.clear();
        }
    }

    public static void main(String[] args) {
        new IpCountService().print();
    }
}
