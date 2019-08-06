package com.hechuangwu.designpatternsdemo.singleton;

/**
 * Created by cwh on 2019/8/6 0006.
 * 功能:饿汉模式
 */
public class HungrySingleton   {
    private static final  HungrySingleton mHungrySingleton  = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return  mHungrySingleton;
    }


}
