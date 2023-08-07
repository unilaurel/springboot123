package com.itcast.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ClassName: ProjectExceptionAdvice
 * Package: com.itcast.controller.utils
 * Description：Spring MVC的异常处理器
 *
 * @Author :zyp
 * @Create 2023/08/07 23:54
 * @Version 1.0
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有异常信息
    @ExceptionHandler
    public R doException(Exception ex){
        //记录日志，
        //通知运维
        //通知开发

        //注意进行异常处理时，一定要在控制台打印
        ex.printStackTrace();
        return new R("服务器异常，请联系管理员");


    }
}
