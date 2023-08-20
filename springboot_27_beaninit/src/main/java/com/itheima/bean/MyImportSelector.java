package com.itheima.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * ClassName: MyImportSelector
 * Package: com.itheima.bean
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 22:06
 * @Version 1.0
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata Metadata) {
        System.out.println("知識"+Metadata.getClassName());
//        System.out.println(Metadata.hasAnnotation("org.springframework.context.annotation.Configuration"));
        boolean flag = Metadata.hasAnnotation("org.springframework.context.annotation.Configuration");
        Map<String, Object> attributes = Metadata.getAnnotationAttributes("org.springframework.context.annotation.ComponentScan");
        System.out.println(attributes);

        if(flag){
            return new String[]{"com.itheima.bean.Dog"};

        }else {
            return new String[]{"com.itheima.bean.Mouse"};
        }


    }
}
