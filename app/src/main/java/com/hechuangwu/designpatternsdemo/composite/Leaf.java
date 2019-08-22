package com.hechuangwu.designpatternsdemo.composite;

import android.util.Log;

/**
 * Created by cwh on 2019/8/19 0019.
 * 功能:
 */
public class Leaf extends Component {
    private static final String TAG = "Leaf";
    public Leaf(String name) {
        super( name );
    }

    @Override
    public void doSomething() {
        Log.i( TAG, "doSomething:>>>"+name );
    }
}
