package com.hechuangwu.designpatternsdemo.responsibility;

/**
 * 责任链模式：
 * 多个对象可以处理同一个请求，而具体由哪个对象处理，取决运行时动态决定
 * 责任链模式的结构，类似数据结构里的链表结构，每个处理对象都指向下一个对象，形成一条“链”
 *
 * android源码中的责任链模式：可查看View的事件分发dispatchTouchEvent(MotionEvent ev) 调用过程
 */

/**
 * Created by cwh on 2019/8/10 0010.
 * 功能: 处理类
 */
public abstract class Leader {
    public Leader nextHandler;

    public final void handleRequest(int money){
        if(money<limit()){
            handle( money );
        }else {
            if(null!=nextHandler){
                nextHandler.handleRequest( money );
            }
        }
    }

    protected abstract int limit();

    protected abstract void handle(int money);
}
