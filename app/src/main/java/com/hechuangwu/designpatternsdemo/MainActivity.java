package com.hechuangwu.designpatternsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        designTest();
    }

    private void designTest() {
        //单例模式
        //        LazySingleton instance = LazySingleton.getInstance();

        //建造者模式
        //        Computer computer = new MacBookBuilder()
        //                .buildBoard( "intel" )
        //                .buildDisplay( "retain" )
        //                .buildOS()
        //                .create();
        //        Log.i( TAG, "Computer Info :>>>>>"+computer.toString() );

        //原型模式1
        //        WordDocument wordDocument = new WordDocument();
        //        wordDocument.setText( "原型文档" );
        //        wordDocument.addImages( "图1" );
        //        wordDocument.showDocument();
        //
        //        WordDocument clone = wordDocument.clone();
        //        clone.setText( "拷贝的文档" );
        //        clone.addImages( "图2" );
        //        clone.showDocument();
        //
        //        wordDocument.showDocument();

        //原型模式2:
//        LoginImpl login = new LoginImpl();
//        login.login();//登录获取用户信息，同时保存用户会话信息
//
//        //     User loginSessionUser = LoginSession.getInstance().getLoginSessionUser(); //修改了用户会话信息，违背设计目的
//        User loginSessionUser = LoginSession.getInstance().getCloneLoginSessionUser();//采用原型模式拷贝一份
//        loginSessionUser.address = new Address( "北京市", "朝阳区", "大望路" );
//
//        Log.i( TAG, "designTest: " + loginSessionUser );//User{age=22, name='JackyWu', phoneNum='null', address=Address{city='北京市', district='朝阳区', street='大望路'}}
//
//        Log.i( TAG, "designTest: " + LoginSession.getInstance().getLoginSessionUser() );//User{age=22, name='JackyWu', phoneNum='null', address=Address{city='深圳市', district='南山区', street='学府路'}}




    }
}
