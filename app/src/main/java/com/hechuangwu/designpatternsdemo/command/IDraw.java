package com.hechuangwu.designpatternsdemo.command;

import android.graphics.Canvas;

/**
 * Created by cwh on 2019/8/12 0012.
 * 功能:
 */
public interface IDraw {

    void draw(Canvas canvas);

    void undo();
}
