package com.hechuangwu.designpatternsdemo.mediator;

import android.util.Log;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class SoundCard extends Colleague {
    private static final String TAG = "SoundCard";
    public SoundCard(Mediator mediator) {
        super( mediator );
    }
    
    public void soundPlay(String data){
        Log.i( TAG, "soundPlay:>>>音频数据输出" );
    }
}
