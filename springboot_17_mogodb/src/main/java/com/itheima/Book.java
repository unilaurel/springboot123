package com.itheima;

/**
 * ClassName: Book
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/12 1:27
 * @Version 1.0
 */
public class Book {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
