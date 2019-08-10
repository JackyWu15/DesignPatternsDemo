package com.hechuangwu.designpatternsdemo.responsibility;

import android.util.Log;

/**
 * Created by cwh on 2019/8/10 0010.
 * 功能:
 */
public class Boss extends Leader {
    private static final String TAG = "Boss";
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        Log.i( TAG, "handle:>>>老板愿意" );
    }
}
