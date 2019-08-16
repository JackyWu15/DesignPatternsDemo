package com.hechuangwu.designpatternsdemo.memoto;

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能:
 */
public class Memo {
    public int mCheckpoint;
    public int mLifeValue ;
    public String mWeapon ;
    @Override
    public String toString() {
        return "Memo{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }



}
