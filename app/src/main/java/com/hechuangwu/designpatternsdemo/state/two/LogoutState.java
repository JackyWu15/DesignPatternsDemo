package com.hechuangwu.designpatternsdemo.state.two;

import android.content.Context;
import android.content.Intent;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:
 */
public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        gotoLoginActivity( context );
    }

    @Override
    public void comment(Context context) {
        gotoLoginActivity( context );
    }

    private void gotoLoginActivity(Context context){
        context.startActivity( new Intent( context,LoginActivity.class ) );
    }
}
