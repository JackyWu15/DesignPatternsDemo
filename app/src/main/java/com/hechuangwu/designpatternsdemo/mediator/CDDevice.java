package com.hechuangwu.designpatternsdemo.mediator;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class CDDevice extends Colleague {
    private String data;
    public CDDevice(Mediator mediator) {
        super( mediator );
    }


    public String read(){
        return  data;
    }


    public void load(){
        data = "视频数据,音频数据载入";
        mMediator.changed( this );

    }
}
