package com.hechuangwu.designpatternsdemo.memoto;

/**
 *  备忘录模式：
 *  保存对象的状态，以便下次使用，本质就是数据的持久化存储。
 *
 *  android源码中的备忘录模式：可查看Activity的onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState)的保存流程
 */

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能: 存档类
 */
public class Caretaker {
    Memo mMemo;

    public void archive(Memo memo){
        this.mMemo = memo;
    }

    public Memo getMemo(){
        return mMemo;
    }
}
