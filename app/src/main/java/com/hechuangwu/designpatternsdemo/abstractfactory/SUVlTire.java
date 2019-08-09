package com.hechuangwu.designpatternsdemo.abstractfactory;

import android.util.Log;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能: 越野轮胎
 */
public class SUVlTire implements ITire {
    private static final String TAG = "ITire";
    @Override
    public void tire() {
        Log.i( TAG, "engine: >>>>>>>>>>>>>越野轮胎" );
    }
}
