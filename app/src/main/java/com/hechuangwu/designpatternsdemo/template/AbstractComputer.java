package com.hechuangwu.designpatternsdemo.template;

import android.util.Log;

/**
 *  模板模式：
 *   多个子类有共有的方法，或把核心的算法设计为模板方法，细节方法由子类去实现，即，将共有的部分抽取到父类中，利用多态原理调用
 *
 */

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能: 抽象类
 */
public abstract class AbstractComputer {
    private static final String TAG = "AbstractComputer";
    protected void powerOn(){
        Log.i( TAG, "powerOn:>>>开启电源" );
    }

    protected void checkHardware(){
        Log.i( TAG, "powerOn:>>>检查硬件" );
    }

    protected void loadOS(){
        Log.i( TAG, "powerOn:>>>载入操作系统" );
    }

    protected void login(){
        Log.i( TAG, "powerOn:>>>直接登录" );
    }

    public final void startUp(){
        Log.i( TAG, "powerOn:>>>开始关机" );
        powerOn();
        checkHardware();
        loadOS();
        login();
        Log.i( TAG, "powerOn:>>>已关机" );
    }
}
