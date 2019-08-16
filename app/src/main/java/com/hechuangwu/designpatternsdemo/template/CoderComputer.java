package com.hechuangwu.designpatternsdemo.template;

import android.util.Log;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:普通计算机
 */
public class CoderComputer extends AbstractComputer {
    private static final String TAG = "CoderComputer";
    @Override
    protected void login() {
        Log.i( TAG, "login:>>>账号和密码登录" );
    }
}
