package com.hechuangwu.designpatternsdemo.mediator;

import android.util.Log;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class GraphicsCard extends Colleague {
    private static final String TAG = "GraphicsCard";
    public GraphicsCard(Mediator mediator) {
        super( mediator );
    }


    public void videoPlay(String data){
        Log.i( TAG, "videoPlay:>>>"+data );
    }
}
