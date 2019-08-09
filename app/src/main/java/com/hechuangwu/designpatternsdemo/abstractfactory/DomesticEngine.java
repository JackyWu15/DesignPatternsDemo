package com.hechuangwu.designpatternsdemo.abstractfactory;

import android.util.Log;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能: 国产引擎
 */
public class DomesticEngine implements IEngine{
    private static final String TAG = "IEngine";
    @Override
    public void engine() {
        Log.i( TAG, "engine: >>>>>>>>>>>>>国产引擎" );
    }
}
