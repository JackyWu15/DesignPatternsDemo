package com.hechuangwu.designpatternsdemo.state.two;

import android.content.Context;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:
 */
public class LoginContext {
    UserState mState = new LogoutState();

    static LoginContext sLoginContext = null;

    private LoginContext(){}
    public static LoginContext getInstance(){
        if(sLoginContext==null){
        synchronized (LoginContext.class){
            if(sLoginContext==null){
                sLoginContext = new LoginContext();
            }
        }}
        return sLoginContext;
    }


    public void setState(UserState state){
        this.mState = state;
    }


    public void forward(Context context) {
        mState.forward( context );
    }

    public void comment(Context context) {
        mState.comment( context );
    }
}
