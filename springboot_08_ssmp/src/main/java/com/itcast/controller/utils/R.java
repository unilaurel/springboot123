package com.itcast.controller.utils;

import lombok.Data;

/**
 * ClassName: R
 * Package: com.itcast.controller.utils
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/07 1:19
 * @Version 1.0
 */

@Data
public class R {



    private boolean flag;
    private Object data;
    private String msg;

    public R(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this.flag=false;
        this.msg = msg;
    }

    public R() {
    }

    public R(boolean flag) {
        this.flag = flag;
    }

    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
