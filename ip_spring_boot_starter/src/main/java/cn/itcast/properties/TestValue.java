package cn.itcast.properties;

import org.springframework.stereotype.Component;

/**
 * ClassName: TestValue
 * Package: cn.itcast.properties
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/19 22:51
 * @Version 1.0
 */
@Component("abc")
public class TestValue {
    private Integer cycle=5;

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }
}
