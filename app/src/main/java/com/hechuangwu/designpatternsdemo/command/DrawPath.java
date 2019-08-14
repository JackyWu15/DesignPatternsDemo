package com.hechuangwu.designpatternsdemo.command;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by cwh on 2019/8/12 0012.
 * 功能: 路径
 */
public class DrawPath implements IDraw {
    public Path mPath;
    public Paint mPaint;
    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath( mPath,mPaint );
    }

    @Override
    public void undo() {

    }
}
