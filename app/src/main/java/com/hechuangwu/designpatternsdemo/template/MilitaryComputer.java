package com.hechuangwu.designpatternsdemo.template;

import android.util.Log;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:军用计算机
 */
public class MilitaryComputer extends AbstractComputer {
    private static final String TAG = "MilitaryComputer";
    @Override
    protected void checkHardware() {
        super.checkHardware();
        Log.i( TAG, "checkHardware:>>>检查硬件防火墙" );
    }

    @Override
    protected void login() {
        Log.i( TAG, "login:>>>进行指纹识别等" );
    }
}
