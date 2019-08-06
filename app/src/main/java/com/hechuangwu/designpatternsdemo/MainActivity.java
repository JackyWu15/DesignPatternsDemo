package com.hechuangwu.designpatternsdemo;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hechuangwu.designpatternsdemo.builder.Computer;
import com.hechuangwu.designpatternsdemo.builder.MacBookBuilder;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //单例模式
//        LazySingleton instance = LazySingleton.getInstance();

        //建造者模式
        Computer computer = new MacBookBuilder()
                .buildBoard( "intel" )
                .buildDisplay( "retain" )
                .buildOS()
                .create();
        Log.i( TAG, "Computer Info :>>>>>"+computer.toString() );

        new AlertDialog.Builder( this );

    }
}
