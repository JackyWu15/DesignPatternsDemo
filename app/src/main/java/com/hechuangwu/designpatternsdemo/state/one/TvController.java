package com.hechuangwu.designpatternsdemo.state.one;

import android.util.Log;

/**
 * 状态模式：
 * 如果同一个类，在不同的状态下有不同的行为，那么可以考虑将类抽取成不同的实现类，切换状态即切换类；
 * 设计理念在于，如果状态的改变，会造成类大部分逻辑的改变，那么应以改变“状态类”来改变“对象的行为”，而不是以改变“对象的状态”来改变“对象的行为”，后一种情况造成，不同状态的不同逻辑处理，都在一个类里实现，会造成类的臃肿，耦合性太强。
 * 但状态增多的同时，类也会跟着增多
 *
 * 状态模式和策略模式区别：状态模式是，类内部状态的改变，导致内部逻辑处理的改变，强调内部处理的改变，而对外是“隐藏”的；
 *                         策略模式是，对外提供多种方案，强调内部提供多种处理方式，以供对外使用。
 *
 * android
 */


/**
 * Created by cwh on 2019/8/9 0009.
 * 功能: 状态控制
 */
public class TvController implements PowerController {
    private static final String TAG = "TvController";
    TvState mTvState;

    private void setTvState(TvState tvState) {
        mTvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState( new PowerOnState() );
        Log.i( TAG, "powerOn:>>>" );
    }

    @Override
    public void powerOff() {
        setTvState( new PowerOffState() );
        Log.i( TAG, "powerOff:>>>" );
    }

   public void nextChannel(){
       mTvState.nextChannel();
   }
   public void prevChannel(){
       mTvState.prevChannel();
   }
   public void turnUp(){
       mTvState.turnUp();
   }

   public void turnDown(){
       mTvState.turnDown();
   }
}
