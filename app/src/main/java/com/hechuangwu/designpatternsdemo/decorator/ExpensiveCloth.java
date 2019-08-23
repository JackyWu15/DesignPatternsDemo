package com.hechuangwu.designpatternsdemo.decorator;

import android.util.Log;

/**
 * Created by cwh on 2019/8/22 0022.
 * 功能: 装饰者，要持有被装饰者的引用
 */
public class ExpensiveCloth extends PersonCloth {
    private static final String TAG = "ExpensiveCloth";
    public ExpensiveCloth(Person person) {
        super( person );
    }


    private void dreesShirt(){
        Log.i( TAG, "dreesShirt:>>>短袖" );
    }

    private void dreesLeather(){
        Log.i( TAG, "dreesShirt:>>>皮衣" );
    }

    @Override
    public void dressed() {
        super.dressed();
        dreesShirt();
        dreesLeather();
    }
}
