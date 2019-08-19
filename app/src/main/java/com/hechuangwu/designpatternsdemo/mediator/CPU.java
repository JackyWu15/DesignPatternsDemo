package com.hechuangwu.designpatternsdemo.mediator;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class CPU extends Colleague {
    private String dataVideo,dataSound;

    public CPU(Mediator mediator) {
        super( mediator );
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void decodeData(String data){
        String[] temp = data.split( "," );
        dataVideo = temp[0];
        dataSound = temp[1];

        mMediator.changed( this );
    }
}
