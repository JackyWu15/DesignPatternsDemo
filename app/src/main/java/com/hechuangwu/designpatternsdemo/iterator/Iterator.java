package com.hechuangwu.designpatternsdemo.iterator;

/**
 *  迭代器模式：
 *  提供一种方法访问一个容器对象，又不提供该对象存储和查询方式
 *  开发中一般很少自己实现迭代器
 *
 */

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能:迭代器
 */
public interface Iterator {

    boolean hasNext();

    Object next();
}
