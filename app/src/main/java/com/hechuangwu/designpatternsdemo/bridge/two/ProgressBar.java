package com.hechuangwu.designpatternsdemo.bridge.two;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.hechuangwu.designpatternsdemo.R;

/**
 * Created by cwh on 2019/8/26 0026.
 * 功能:
 */
public class ProgressBar extends View {
    private static final int HEIGHT = 0x6846,WIDTH=0x7889;
    private BaseProgressBar mBaseProgressBar;
    private int mStyle;

    public ProgressBar(Context context) {
        this( context,null );
    }

    public ProgressBar(Context context, AttributeSet attrs) {
        this( context, attrs ,0);
    }

    public ProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super( context, attrs, defStyleAttr );

        TypedArray typedArray = context.obtainStyledAttributes( attrs, R.styleable.ProgressBar, defStyleAttr, 0 );
        mStyle = typedArray.getInt( R.styleable.ProgressBar_style, BaseProgressBar.CIRCLE );
        if(mStyle ==BaseProgressBar.HORIZONTAL){
            mBaseProgressBar = new HorizontalProgressBar();
        }else if(mStyle ==BaseProgressBar.VERTICAL){
            mBaseProgressBar = new VerticalProgressBar();
        }else{
            mBaseProgressBar = new CircleProgressBar();
        }
        typedArray.recycle();

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//       setMeasuredDimension(  );

    }

    private int measureDimension(int type,int measureSpec){
        if(mStyle==BaseProgressBar.CIRCLE){
            return mBaseProgressBar.getMeasureWidth();
        }

        int result;
        int mode = MeasureSpec.getMode( measureSpec );
        int size = MeasureSpec.getSize( measureSpec );

        if(mode==MeasureSpec.EXACTLY){
            result = size;
        }else {
            if(type==HEIGHT){
                result = mBaseProgressBar.getMeasureHeight();
            }else {
                result = mBaseProgressBar.getMeasureWidth();
            }

            if(mode==MeasureSpec.AT_MOST){
                result = Math.min( result,size );
            }

        }

        return result;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        mBaseProgressBar.draw( this,canvas );
    }
}
