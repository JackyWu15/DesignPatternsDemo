package com.hechuangwu.designpatternsdemo.command;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.hechuangwu.designpatternsdemo.R;


/**
 *  命令模式：
 *  抽象出需要执行的动作，以参数的形式提供出来，类似回调机制。
 *  实际上是将所有行为都进行抽取分离并封装，以达到解耦的作用。
 *
 *
 */

/**
 * Created by cwh on 2019/8/12 0012.
 * 功能: 画板
 */
public class DrawActivity extends Activity {
    private DrawPath mPath;
    private Paint mPaint;
    private DrawCanvas mDrawCanvas;
    private IBrush mBrush;
    private Button mBtRedo;
    private Button mBtUndo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_draw );
        mPaint = new Paint( );
        mPaint.setColor( Color.GREEN );
        mPaint.setStrokeWidth( 3 );

        mBrush = new NormalBrush();

        mDrawCanvas = findViewById( R.id.dc_canvas );
        mDrawCanvas.setOnTouchListener( new DrawTouchListener() );

        mBtRedo = findViewById( R.id.bt_redo );
        mBtUndo = findViewById( R.id.bt_undo );
        mBtRedo.setEnabled( false );
        mBtUndo.setEnabled( false );
    }

    public void red(View view) {
        mPaint = new Paint();
        mPaint.setStrokeWidth( 3 );
        mPaint.setColor( Color.RED );
    }

    public void green(View view) {
        mPaint = new Paint();
        mPaint.setStrokeWidth( 3 );
        mPaint.setColor( Color.GREEN );
    }

    public void normal(View view) {
        mBrush = new NormalBrush();
    }

    public void circle(View view) {
        mBrush = new CircleBrush();
    }

    public void undo(View view) {
        mDrawCanvas.undo();
        if(!mDrawCanvas.canUndo()){
            mBtUndo.setEnabled( false );
        }
        mBtRedo.setEnabled( true );
    }

    public void redo(View view) {
        mDrawCanvas.redo();
        if(!mDrawCanvas.canRedo()){
            mBtRedo.setEnabled( false );
        }
        mBtUndo.setEnabled( true );
    }

    private class  DrawTouchListener implements View.OnTouchListener{
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction()==MotionEvent.ACTION_DOWN){
                mPath = new DrawPath();
                mPath.mPaint = mPaint;
                mPath.mPath = new Path(  );

                mBrush.down( mPath.mPath,event.getX(),event.getY() );
            }else if(event.getAction()==MotionEvent.ACTION_MOVE){
                mBrush.move( mPath.mPath,event.getX(),event.getY() );
            }else if(event.getAction()==MotionEvent.ACTION_UP){
                mBrush.up( mPath.mPath,event.getX(),event.getY() );
                mDrawCanvas.add(mPath);
                mDrawCanvas.isDrawing = true;

                mBtRedo.setEnabled( false );
                mBtUndo.setEnabled( true );
            }
            return true;
        }
    }

}
