package com.hechuangwu.designpatternsdemo.composite;

/**
 * 组合模式：
 * 可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，让高层模块忽略层次差异，方便对整个层次结构进行控制。
 * 实际开发中很少使用组合模式，通常会在一些语言架构或UI框架上使用。
 *
 * android源码中的组合模式：View和ViewGroup的嵌套组合，ViewGroup继承View，同时实现了ViewParent和ViewManager扩展成为一个容器。
 */


/**
 * Created by cwh on 2019/8/19 0019.
 * 功能:抽象节点
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomething();
}
