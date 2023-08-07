package com.itcast.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Book
 * Package: com.itcast.domain
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/05 22:35
 * @Version 1.0
 */

@Data
//@AllArgsConstructor
//@NoArgsConstructor   实际开发中使用无参数构造比较多
public class Book {
    public Integer id;
    private String type;
    private String name;
    private String description;


}
