package com.hechuangwu.designpatternsdemo.observer;

import java.util.Observable;

/**
 *  观察者模式：
 *  一种一对多的关系，使得被观察的对象一改变，所有观察对象都会自动收到通知。
 *  事件多级触发、消息队列或事件总线等处理机制时使用。
 *
 * android源码中的单例模式：可查看Adapter.notifyDataSetChanged的调用过程
 */

/**
 * Created by cwh on 2019/8/14 0014.
 * 功能:被观察者
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content){
        setChanged();
        notifyObservers( content );
    }
}
