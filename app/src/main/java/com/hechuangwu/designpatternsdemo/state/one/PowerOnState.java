package com.hechuangwu.designpatternsdemo.state.one;

import android.util.Log;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能: 开机状态下的功能
 */
public class PowerOnState implements TvState {
    private static final String TAG = "PowerOnState";
    @Override
    public void nextChannel() {
        Log.i( TAG, "nextChannel:>>>下一个频道" );
    }

    @Override
    public void prevChannel() {
        Log.i( TAG, "nextChannel:>>>上一个频道" );
    }

    @Override
    public void turnUp() {
        Log.i( TAG, "nextChannel:>>>调高音量" );
    }

    @Override
    public void turnDown() {
        Log.i( TAG, "nextChannel:>>>调低音量" );
    }
}
