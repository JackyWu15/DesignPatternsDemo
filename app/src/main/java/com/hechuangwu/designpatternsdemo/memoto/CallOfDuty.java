package com.hechuangwu.designpatternsdemo.memoto;

import android.util.Log;

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能:
 */
public class CallOfDuty {
    private static final String TAG = "CallOfDuty";
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";


    public void play(){
        Log.i( TAG, "play:>>>玩游戏"+String.format( "第%d关",mCheckpoint )+"奋战杀敌中" );
        mLifeValue -=10;
        Log.i( TAG, "play:>>>进度升级" );
        mCheckpoint++;
        Log.i( TAG, "play:>>>到达"+String.format( "第%d关",mCheckpoint ) );

    }

    public void quit(){
        Log.i( TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" );
        Log.i( TAG, "quit:>>>退出前的游戏属性"+this.toString() );
        Log.i( TAG, "quit:>>>退出游戏" );
        Log.i( TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" );
    }



    public Memo createMemoto(){
        Memo memo = new Memo();
        memo.mCheckpoint = this.mCheckpoint;
        memo.mLifeValue = this.mLifeValue;
        memo.mWeapon = this.mWeapon;
        return memo;
    }

    public void restore(Memo memo){
        this.mCheckpoint = memo.mCheckpoint;
        this.mLifeValue = memo.mLifeValue;
        this.mWeapon = memo.mWeapon;
        Log.i( TAG, "restore:>>>恢复后的游戏属性"+this.toString() );

    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
