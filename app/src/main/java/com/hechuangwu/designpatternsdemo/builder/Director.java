package com.hechuangwu.designpatternsdemo.builder;

/**
 * Created by cwh on 2019/8/6 0006.
 * 功能:负责构造Computer
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder){
        this.mBuilder = builder;
    }

    public void construct(String board,String display){
            mBuilder.buildBoard( board );
            mBuilder.buildDisplay( display );
            mBuilder.buildOS();
    }

}
