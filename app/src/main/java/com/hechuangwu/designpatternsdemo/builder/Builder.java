package com.hechuangwu.designpatternsdemo.builder;

/**
 * Created by cwh on 2019/8/6 0006.
 * 功能:抽象的Builder
 */
public abstract class Builder {
    //设置主机
    public abstract Builder buildBoard(String board);

    //设置显示器
    public abstract Builder buildDisplay(String display);

    //设置操作系统
    public abstract Builder buildOS();

    //创建计算机
    public abstract Computer create();

}
