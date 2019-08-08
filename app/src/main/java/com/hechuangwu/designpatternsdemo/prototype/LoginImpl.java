package com.hechuangwu.designpatternsdemo.prototype;

/**
 * Created by cwh on 2019/8/8 0008.
 * 功能:
 */
public class LoginImpl implements Login {
    @Override
    public void login() {
        User user = new User();
        user.age = 22;
        user.name = "JackyWu";
        user.address = new Address( "深圳市","南山区","学府路" );
        LoginSession.getInstance().setLoginSessionUser( user );
    }

}
