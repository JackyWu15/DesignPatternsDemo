package com.hechuangwu.designpatternsdemo.adapter.two;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hechuangwu.designpatternsdemo.R;

import java.util.ArrayList;

/**
 *  适配器模式：
 *  需求需要使用现有的类，但此类的接口不符合系统的需要，即接口不兼容
 *  需要建立一个重复使用的类，用于彼此之间没有太多关联的类
 *
 *  android源码中的适配器模式：ListView和RecycleView的adapter
 */


/**
 * Created by cwh on 2019/8/21 0021.
 * 功能: 自定义菜单控件
 */
public class CircleMenuActivity extends Activity {
    private int[] itemImages = new int[]{R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round};
    private String[] itemTexts = new String[]{"安全","特色","转账","账户","信用","投资"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_circlemenu );
        CircleMenuLayout cml_view = findViewById( R.id.cml_view );
//        cml_view.setMenuItemIconsAndTexts( itemImages,itemTexts );
        ArrayList<CircleMenuLayout.MenuItem> menuItems = new ArrayList<>();
        CircleMenuLayout.MenuItem menuItem = null;
        for (int i = 0; i < 6; i++) {
            menuItem = new CircleMenuLayout.MenuItem( itemImages[i],itemTexts[i] );
            menuItems.add( menuItem );
        }

        cml_view.setAdapter( new CircleMenuLayout.CircleMenuAdapter(menuItems) );


        cml_view.setOnMenuItemClickListener( new OnMenuItemClickListener() {
            @Override
            public void onClick(View v, int childIndex) {
                Toast.makeText( CircleMenuActivity.this,itemTexts[childIndex] ,Toast.LENGTH_LONG).show();
            }
        } );
    }
}
