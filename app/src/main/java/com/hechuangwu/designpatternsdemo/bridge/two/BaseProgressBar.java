package com.hechuangwu.designpatternsdemo.bridge.two;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by cwh on 2019/8/26 0026.
 * 功能:
 */
public abstract class BaseProgressBar {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int CIRCLE = 2;
    public final Paint mPaint;

    public BaseProgressBar() {
        mPaint = new Paint( Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG );
    }

    public abstract int getMeasureHeight();
    public abstract int getMeasureWidth();
    public abstract void draw(View view, Canvas canvas);
}
