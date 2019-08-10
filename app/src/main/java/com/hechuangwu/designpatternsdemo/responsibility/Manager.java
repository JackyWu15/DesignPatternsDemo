package com.hechuangwu.designpatternsdemo.responsibility;

import android.util.Log;

/**
 * Created by cwh on 2019/8/10 0010.
 * 功能:
 */
public class Manager extends Leader {
    private static final String TAG = "Manager";
    @Override
    public int limit() {
        return 50000;
    }

    @Override
    public void handle(int money) {
        Log.i( TAG, "handle:>>>经理报销"+money+"元" );
    }
}
