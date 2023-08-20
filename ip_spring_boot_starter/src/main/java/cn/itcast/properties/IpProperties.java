package cn.itcast.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: IpProperties
 * Package: cn.itcast.properties
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/19 22:10
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "iptools.ip")
//@Data
@Component("ipProperties")
public class IpProperties {
    /**
     * 日志显示周期
     */
    private Long cycle=1L;
    /**
     * 是否周期内重置数据
     */
    private boolean cycleReset=false;
    /**
     * 日志输出模式：detail,详细模式  simple,极简模式
     */
    private String model = LogModel.DETAIL.value;

    public Long getCycle() {
        return cycle;
    }

    public void setCycle(Long cycle) {
        this.cycle = cycle;
    }

    public boolean isCycleReset() {
        return cycleReset;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCycleReset(boolean cycleReset) {
        this.cycleReset = cycleReset;
    }

    public boolean getCycleReset(){
        return this.cycleReset;
    }

    public enum LogModel{
        DETAIL("detail"),
        SIMPLE("simple");

        private String value;
        LogModel(String value) {
            this.value=value;
        }

        public String getValue() {
            return value;
        }
    }

}
