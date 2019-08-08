package com.hechuangwu.designpatternsdemo.prototype;

/**
 * prototype:原型模式
 *  使用场景：
 *  1，是在内存中进行二进制流的拷贝，要比直接new性能好，特别是循环语句内大量new的时候，可以减少开销
 *  2，某个对象只提供只读功能，限制外部修改
 *  如果clone效率如果太低，将使用new的方式来重新生成一个对象
 *
 * android源码中的原型模式：可查看Intent的clone()方法，使用的是定义拷贝构造函数的方式来实现
 */

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cwh on 2019/8/7 0007.
 * 功能:ConcretePrototype
 */
public class WordDocument implements Cloneable  {
    private static final String TAG = "WordDocument";
    private String mText;//文本
    private ArrayList<String> mImages = new ArrayList<>(  );//图片

    //clone是Object中的方法，实现Cloneable标明该类可以进行拷贝，如果没有实现Cloneable，调用clone将抛出异常
    @Override
    public WordDocument clone() {
        try {
            WordDocument clone = (WordDocument) super.clone();
            clone.mText = this.mText;
//            clone.mImages = this.mImages;//浅拷贝，即引用指向了相同地址
            clone.mImages = (ArrayList<String>)this.mImages.clone();//深拷贝，重新分配自己的空间，指向新的地址，并将原来的数据拷贝进去
            return  clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void showDocument(){
        for(String imageName:mImages){
            Log.i( TAG, "showDocument: >>>"+mText+">>>"+imageName );
            Log.i( TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" );
        }
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public List<String> getImages() {
        return mImages;
    }

    public void addImages(String image) {
        mImages.add( image );
    }
}
