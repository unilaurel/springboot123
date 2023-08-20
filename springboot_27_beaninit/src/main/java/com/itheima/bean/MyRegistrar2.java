package com.itheima.bean;

import com.itheima.bean.service.impl.BookServiceImpl2;
import com.itheima.bean.service.impl.BookServiceImpl3;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ClassName: MyRegistrar
 * Package: com.itheima.bean
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/17 22:23
 * @Version 1.0
 */
public class MyRegistrar2 implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //1.  使用元数据判定
        BeanDefinition beanDefinition= BeanDefinitionBuilder.rootBeanDefinition(BookServiceImpl3.class).getBeanDefinition();
        registry.registerBeanDefinition("bookService",beanDefinition);
    }
}
