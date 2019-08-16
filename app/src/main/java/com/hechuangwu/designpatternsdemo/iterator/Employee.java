package com.hechuangwu.designpatternsdemo.iterator;

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能:
 */
public class Employee {
    private String name;
    private int age;
    private String sex;


    public Employee(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
