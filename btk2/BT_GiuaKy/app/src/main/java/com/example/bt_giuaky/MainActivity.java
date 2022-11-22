package com.example.bt_giuaky;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Button button = findViewById(R.id.gotoRegister);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this , MainActivity_DangKy.class));
//            }
//        });
//        TextView textView1 = (TextView) findViewById(R.id.inputEmail);
//        TextView textView2 =  (TextView)  findViewById(R.id.inputPassword);
//        Button but = findViewById(R.id.login);
//        but.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String user = "admin";
//                String pass = "admin";
//
//                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)){
//                    Toast.makeText( MainActivity.this,"Tài khoản hoặc mật khẩu không được để trống" , Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    if ((textView1.getText().toString().equals(user)) && (textView2.getText().toString().equals(pass))){
//                        Toast.makeText( MainActivity.this,"Thành Công" , Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                        startActivity(intent);
//                    }
//                    else{
//                        Toast.makeText(MainActivity.this,"Tài khoản hoặc mật khẩu không đúng" , Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        });
//    }
    private EditText emailedit, passedit;
    private Button btnlogin , btnregis ;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

        emailedit = findViewById(R.id.inputEmail);
        passedit = findViewById(R.id.inputPassword);
        btnlogin = findViewById(R.id.login);
        btnregis = findViewById(R.id.gotoRegister);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
        Intent intent = new Intent(MainActivity.this,MainActivity_DangKy.class);
        startActivity(intent);
    }

    private void login(){
        String taiKhoan , pass;
        TextView textView1 = (TextView) findViewById(R.id.inputEmail);
        TextView textView2 =  (TextView)  findViewById(R.id.inputPassword);
        taiKhoan = textView1.getText().toString();
        pass = textView2.getText().toString();
        if (TextUtils.isEmpty(taiKhoan) || TextUtils.isEmpty(pass)){
            Toast.makeText( MainActivity.this,"Tài khoản hoặc mật khẩu không được để trống" , Toast.LENGTH_SHORT).show();
        }
        FirebaseAuth  authException = FirebaseAuth.getInstance();
        authException.signInWithEmailAndPassword(taiKhoan,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){
                    Toast.makeText( MainActivity.this,"Đăng nhập thành công" , Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                    startActivity(intent);
                } else{
                    Toast.makeText( MainActivity.this,"Tài khoản hoặc mật khẩu không đúng" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}