package com.google.a2050531200341_nguyenvantho_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        TextView textView1 = (TextView) findViewById(R.id.inputEmail);
        TextView textView2 =  (TextView)  findViewById(R.id.inputPassword);
        Button signIn = (Button) findViewById(R.id.login);
        Button signout = (Button) findViewById(R.id.gotoRegister);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = "admin";
                String pass = "admin";

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)){
                    Toast.makeText( MainActivity.this,"Tài khoản hoặc mật khẩu không được để trống" , Toast.LENGTH_SHORT).show();
                }
                else {
                    if ((textView1.getText().toString().equals(user)) && (textView2.getText().toString().equals(pass))){
                        Toast.makeText( MainActivity.this,"Thành Công" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),profile.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText( MainActivity.this,"Tài khoản hoặc mật khẩu không đúng" , Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),dangky.class);
                startActivity(intent);
            }
        });



    }
}