package com.hechuangwu.designpatternsdemo.proxy;

import android.util.Log;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class XiaoMin implements ILawsuit {
    private static final String TAG = "XiaoMin";
    @Override
    public void submit() {
        Log.i( TAG, "submit:>>>仲裁" );
    }

    @Override
    public void burden() {
        Log.i( TAG, "submit:>>>工资流水" );
    }

    @Override
    public void defend() {
        Log.i( TAG, "submit:>>>证据" );
    }

    @Override
    public void finish() {
        Log.i( TAG, "submit:>>>结束" );
    }
}
