package com.itheima.controller;

/**
 * 这是一个用于表示人类的类。
 * <p>
 * 这个类有一些基本属性，如姓名，年龄等。
 *
 * @author 您的名字
 * @version 1.0
 */
public class Person {

    private String name;
    private int age;

    /**
     * 这是一个用于设置人类姓名的方法。
     *
     * @param name 人的名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 这是一个用于获取人类姓名的方法。
     *
     * @return 返回人的名字
     */
    public String getName() {
        return name;
    }

    /**
     * 这是一个用于设置人类年龄的方法。
     *
     * @param age 人的年龄
     */
    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }
}
