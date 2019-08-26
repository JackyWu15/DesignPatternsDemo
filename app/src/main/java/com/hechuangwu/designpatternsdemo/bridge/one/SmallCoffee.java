package com.hechuangwu.designpatternsdemo.bridge.one;

import android.util.Log;

/**
 * Created by cwh on 2019/8/26 0026.
 * 功能:
 */
public class SmallCoffee extends Coffee {
    private static final String TAG = "SmallCoffee";
    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super( coffeeAdditives );
    }

    @Override
    public void makeCoffee() {
        Log.i( TAG, "makeCoffee:>>>小杯"+ mCoffeeAdditives.addSomething()+"咖啡" );
    }
}
