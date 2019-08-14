package com.hechuangwu.designpatternsdemo.command;


import android.graphics.Path;

/**
 * Created by cwh on 2019/8/12 0012.
 * 功能:
 */
public interface IBrush {

     void down(Path path, float x, float y);
    void move(Path path, float x, float y);
    void up(Path path, float x, float y);
}
