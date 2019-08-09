package com.hechuangwu.designpatternsdemo.prototype;

/**
 * Created by cwh on 2019/8/8 0008.
 * 功能:
 */
public class LoginSession {
    static LoginSession loginSession = null;

    private User mUser;

    public static LoginSession getInstance() {
        if (loginSession == null) {
            synchronized (LoginSession.class) {
                if (loginSession == null) {
                    loginSession = new LoginSession();
                }
            }
        }
        return loginSession;
    }

    //限制非包级别修改用户信息，只能通过此方法修改用户信息
    void setLoginSessionUser(User user){
        this.mUser = user;
    }


    public User getLoginSessionUser(){
        return  this.mUser;
    }

    public User getCloneLoginSessionUser(){
        return  mUser.clone();
    }

}
