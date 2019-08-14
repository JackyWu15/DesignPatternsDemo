package com.hechuangwu.designpatternsdemo.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cwh on 2019/8/14 0014.
 * 功能:
 */
public class Coder implements Observer {
    private static final String TAG = "Coder";
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.i( TAG, "update:>>>"+name+": "+arg );
    }
}
