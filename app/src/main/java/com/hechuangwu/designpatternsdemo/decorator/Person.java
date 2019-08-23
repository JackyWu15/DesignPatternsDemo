package com.hechuangwu.designpatternsdemo.decorator;

/**
 *  装饰模式：
 *  动态对一个对象添加一些额外的功能
 *
 *  android源码中的装饰模式：查看ContextWrapper对ContextImpl和Activity的装饰
 */

/**
 * Created by cwh on 2019/8/22 0022.
 * 功能: 抽象类
 */
public abstract class Person {
    public abstract void dressed();
}
