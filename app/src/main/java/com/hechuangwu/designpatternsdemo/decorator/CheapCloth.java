package com.hechuangwu.designpatternsdemo.decorator;

import android.util.Log;

/**
 * Created by cwh on 2019/8/22 0022.
 * 功能:
 */
public class CheapCloth extends PersonCloth {
    private static final String TAG = "CheapCloth";
    public CheapCloth(Person person) {
        super( person );
    }

    public void dressShorts(){
        Log.i( TAG, "dressShorts:>>>" );
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
