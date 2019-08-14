package com.hechuangwu.designpatternsdemo.command;


import android.graphics.Path;

/**
 * Created by cwh on 2019/8/12 0012.
 * 功能: 笔触图形
 */
public class NormalBrush implements IBrush {
    @Override
    public void down(Path path, float x, float y) {
        path.moveTo( x,y );
    }

    @Override
    public void move(Path path, float x, float y) {
        path.lineTo( x,y );
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
