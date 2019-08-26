package com.hechuangwu.designpatternsdemo.facade;

import android.util.Log;

/**
 * Created by cwh on 2019/8/26 0026.
 * 功能:
 */
public class SamsungCamera implements Camera {
    private static final String TAG = "SamsungCamera";
    @Override
    public void open() {
        Log.i( TAG, "open:>>>打开相机" );
    }

    @Override
    public void takePicture() {
        Log.i( TAG, "open:>>>拍照" );
    }

    @Override
    public void close() {
        Log.i( TAG, "open:>>>关闭相机" );
    }
}
