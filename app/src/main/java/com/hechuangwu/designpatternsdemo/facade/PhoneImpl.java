package com.hechuangwu.designpatternsdemo.facade;

import android.util.Log;

/**
 * Created by cwh on 2019/8/26 0026.
 * 功能:
 */
public class PhoneImpl implements Phone {
    private static final String TAG = "PhoneImpl";
    @Override
    public void call() {
        Log.i( TAG, "call:>>>打电话" );
    }

    @Override
    public void hangup() {
        Log.i( TAG, "hangup:>>>挂断" );
    }
}
