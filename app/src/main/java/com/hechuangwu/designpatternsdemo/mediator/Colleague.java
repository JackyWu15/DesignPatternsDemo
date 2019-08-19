package com.hechuangwu.designpatternsdemo.mediator;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class Colleague {
    protected Mediator mMediator;
    public Colleague(Mediator mediator){
        this.mMediator = mediator;
    }
}
