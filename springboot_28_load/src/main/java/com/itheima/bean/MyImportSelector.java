package com.itheima.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ClassName: MyImportSelector
 * Package: com.itheima.bean
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 23:23
 * @Version 1.0
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        try {
            Class<?> clazz = Class.forName("com.itheima.bean.wolf");
            if (clazz != null) {

                return new String[]{"com.itheima.bean.Cat"};
            }

        } catch (ClassNotFoundException e) {
            return new String[0];
        }

        return null;
    }
}
