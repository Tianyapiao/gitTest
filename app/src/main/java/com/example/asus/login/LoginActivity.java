package com.example.asus.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/10/16.
 */

public class LoginActivity extends AppCompatActivity {

    private EditText name;
    private EditText pwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = (EditText) findViewById(R.id.et_username);
        pwd = (EditText) findViewById(R.id.et_password);
        TextView login = (TextView) findViewById(R.id.Login_TextView_Send);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name2 =  name.getText().toString().trim();
                String pwd2 =  pwd.getText().toString().trim();
                /*System.out.println("用户名："+name2);
                System.out.println("密  码："+pwd2);*/
                Log.v( "用户名： ",name2 );
                Log.v( "密  码 ",pwd2 );
                if ("123".equals(name2)&&"456".equals(pwd2)) {
                    Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT);
                    Intent intent =new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this,"登录失败",Toast.LENGTH_SHORT);
                }
            }
        });


    }
}
