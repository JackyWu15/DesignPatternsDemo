package com.hechuangwu.designpatternsdemo.state.two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hechuangwu.designpatternsdemo.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
    }

    public void login(View view) {
        LoginContext instance = LoginContext.getInstance();
        instance.setState( new LoginState() );
        instance.forward( this );
        finish();
    }
}
