package com.hechuangwu.designpatternsdemo.command;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by cwh on 2019/8/12 0012.
 * 功能:
 */
public class DrawCanvas extends SurfaceView implements SurfaceHolder.Callback {
    public boolean isDrawing,isRunning;//是否绘制，绘制线程是否可以运行

    private Bitmap mBitmap;
    private DrawInvoker mInvoker;
    private DrawThread mThread;
    public DrawCanvas(Context context, AttributeSet attributeSet) {
        super( context ,attributeSet);
        mInvoker = new DrawInvoker();
        mThread = new DrawThread();
        getHolder().addCallback( this );
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        mBitmap = Bitmap.createBitmap( width,height,Bitmap.Config.RGB_565 );
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRunning = true;
        mThread.start();

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        while (retry){
            try{
                mThread.join();
                retry = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void add(DrawPath path){
        mInvoker.add( path );
    }


    public  void redo(){
        isDrawing = true;
        mInvoker.redo();
    }

    public void undo(){
        isDrawing = true;
        mInvoker.undo();
    }


    public boolean canUndo(){
        return  mInvoker.canUndo();
    }

    public boolean canRedo(){
        return mInvoker.canRedo();
    }


    private class DrawThread extends Thread{
        @Override
        public void run() {
            Canvas canvas = null;
            while (isRunning){
                if(isDrawing){
                    try {
                        canvas = getHolder().lockCanvas(null);
                        if(mBitmap==null){
                            mBitmap = Bitmap.createBitmap( 1,1,Bitmap.Config.ARGB_8888 );
                        }
                        Canvas c = new Canvas( mBitmap );
                        c.drawColor( 0, PorterDuff.Mode.CLEAR );
                        canvas.drawColor( 0,PorterDuff.Mode.CLEAR );

                        mInvoker.execute( c );

                        canvas.drawBitmap( mBitmap,0,0,null );
                    }finally {
                        getHolder().unlockCanvasAndPost( canvas );
                    }
                    isDrawing = false;

                }
            }

        }
    }
}
