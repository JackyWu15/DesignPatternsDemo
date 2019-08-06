package com.hechuangwu.designpatternsdemo.builder;

/**
 *  Builder:建造者模式
 *  为了将构造过程和部件对象隔离开来，使得部件和构造过程本身都可以自由扩展，降低了解耦性
 *  其中，builder用于限定构造过程，product(Computer)用于限定部件对象，Director用于整合builder和product
 *  实际开发中，会省略Director，直接在builder中实现链式调用
 *  
 *  android源码中的建造者模式：可查看new AlertDialog.Builder( Context context)调用过程
 */

/**
 * Created by cwh on 2019/8/6 0006.
 * 功能:计算机抽象类
 */
public abstract class Computer {
    protected  String mBoard;//主机
    protected String mDisplay;//内存
    protected String mOS;//操作系统


    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
