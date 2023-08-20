package com.itheima.domain;

import lombok.Data;

/**
 * ClassName: BOOK
 * Package: com.itheima.domain
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 21:11
 * @Version 1.0
 */
@Data
public class Book {
    private int id;
    private String name;
    private String type;
    private String description;
}
