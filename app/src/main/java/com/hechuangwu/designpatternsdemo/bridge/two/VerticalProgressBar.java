package com.hechuangwu.designpatternsdemo.bridge.two;

import android.graphics.Canvas;
import android.view.View;

/**
 * Created by cwh on 2019/8/26 0026.
 * 功能:
 */
public class VerticalProgressBar extends BaseProgressBar {
    @Override
    public int getMeasureHeight() {
        return 50;
    }

    @Override
    public int getMeasureWidth() {
        return 1000;
    }

    @Override
    public void draw(View view, Canvas canvas) {

    }
}
