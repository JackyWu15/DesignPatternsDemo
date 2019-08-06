package com.hechuangwu.designpatternsdemo.builder;

/**
 * Created by cwh on 2019/8/6 0006.
 * 功能:实际的计算机
 */
public class MacBook extends Computer {
    @Override
    public void setOS() {
        mOS = "Mac OS X 15.10";
    }
}
