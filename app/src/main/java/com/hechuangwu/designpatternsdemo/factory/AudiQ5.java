package com.hechuangwu.designpatternsdemo.factory;

import android.util.Log;

/**
 * Created by cwh on 2019/8/8 0008.
 * 功能:
 */
public class AudiQ5 extends AudiCar {

    @Override
    public void drive() {
        Log.i( "AudiQ5", "AudiQ5: >>>开始启动" );
    }

    @Override
    public void selfNavigation() {
        Log.i( "data", "AudiQ5: >>>开始自动导航" );
    }
}
