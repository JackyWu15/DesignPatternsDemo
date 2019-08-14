package com.hechuangwu.designpatternsdemo.command;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cwh on 2019/8/12 0012.
 * 功能: 绘制和保存路径Control类
 */
public class DrawInvoker {
    //绘制列表
    private List<DrawPath> mDrawPathList = Collections.synchronizedList( new ArrayList<DrawPath>(  ) );
    //重做列表
    private List<DrawPath> mRedoList = Collections.synchronizedList( new ArrayList<DrawPath>(  ) );

    //添加绘制命令
    public void add(DrawPath command){
        mRedoList.clear();
        mDrawPathList.add( command );
    }

    //重做
    public void undo(){
        if(mDrawPathList.size()>0){
            DrawPath drawPath = mDrawPathList.get( mDrawPathList.size() - 1 );
            mDrawPathList.remove( mDrawPathList.size()-1 );
            drawPath.undo();
        }
    }

    //撤销
    public void redo(){
        if(mRedoList.size()>0) {
            DrawPath drawPath = mRedoList.get( mRedoList.size() - 1 );
            mRedoList.remove( mRedoList.size()-1 );
            mDrawPathList.add( drawPath );
        }

    }

    //是否能重做
    public boolean canRedo(){
        return mRedoList.size()>0;
    }

    //是否能撤销
    public boolean canUndo(){
        return mDrawPathList.size()>0;
    }

    //执行命令
    public void execute(Canvas canvas){
        if(mDrawPathList!=null){
            for (DrawPath drawPath:mDrawPathList) {
                drawPath.draw( canvas );
            }
        }
    }
}
