package com.hechuangwu.designpatternsdemo.state.two;

import android.content.Context;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:
 */
public interface UserState {
    void forward(Context context);
    void comment(Context context);
}
