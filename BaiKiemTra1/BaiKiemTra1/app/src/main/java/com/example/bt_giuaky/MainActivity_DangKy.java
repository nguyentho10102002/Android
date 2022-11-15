package com.example.bt_giuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_DangKy extends AppCompatActivity {
    EditText pass_su_txt, cornfirm_pass_txt, inputtEmail;
    Button signupbtn;
    TextView signintv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dang_ky);
        AnhXa();
        controlButton();
    }

    private void controlButton() {
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputtEmail.getText().toString().isEmpty() ||
                        pass_su_txt.getText().toString().isEmpty() || cornfirm_pass_txt.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity_DangKy.this, "Nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                } else {
                    if(!cornfirm_pass_txt.getText().toString().equals(pass_su_txt.getText().toString())){
                        Toast.makeText(MainActivity_DangKy.this, "Xác nhận mật khẩu không chính xác", Toast.LENGTH_SHORT).show();
                        cornfirm_pass_txt.setText("");
                    } else {
                        Intent intent = new Intent(MainActivity_DangKy.this, MainActivity.class);
                        Toast.makeText(MainActivity_DangKy.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                }
            }
        });

        signintv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_DangKy.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


    private void AnhXa() {
        pass_su_txt = (EditText) findViewById(R.id.inputPassword);
        cornfirm_pass_txt = (EditText)  findViewById(R.id.reenterpassword);
        inputtEmail = (EditText) findViewById(R.id.inputEmail);
        signupbtn = (Button) findViewById(R.id.logup);
        signintv = (TextView) findViewById(R.id.backlogup);
    }
}