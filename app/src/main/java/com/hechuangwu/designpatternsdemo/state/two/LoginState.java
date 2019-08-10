package com.hechuangwu.designpatternsdemo.state.two;

import android.content.Context;
import android.util.Log;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:
 */
public class LoginState implements UserState {
    private static final String TAG = "LoginState";
    @Override
    public void forward(Context context) {
        Log.i( TAG, "forward:>>>转发" );
    }

    @Override
    public void comment(Context context) {
        Log.i( TAG, "comment:>>>评论" );
    }

}
