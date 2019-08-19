package com.hechuangwu.designpatternsdemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  代理模式：
 *  远程代理(Remote Proxy)：为某个对象在不同的内存地址空间提供局部代理，使系统可以将Server部分的实现隐藏起来
 *  虚拟代理(Virtual Proxy)：为某个对象设置一个临时代理类来表示目标对象，等到真正需要时才创建真正的目标对象
 *  保护代理(Protection Proxy)：使用代理，控制对原始对象的访问。
 *
 *  Binder代理：
 *  如果两个对象不在于相同的内存地址空间中，那么相互无法直接访问，比如，不同的进程中，两个对象所处的内存空间通常是不一样的，那么此时便需要跨进程的通信技术；
 *  Linux的跨进程技术有：Socket,信号量，管道，内存共享，消息队列，共享文件等；
 *  除了Linux原有的方式，android实现了Binder机制，在保证安全性的同时，也保证了传输性能；
 *  进程间的通信方式，具体可查看托管在github的Client和Server示例
 *
 *  
 */

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能: android系统代理类
 */
public class DynamicProxy implements InvocationHandler {
    private Object mObject;

    public DynamicProxy(Object object) {
        mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke( mObject, args );
        return invoke;
    }
}
