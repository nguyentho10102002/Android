package com.google.baikiemtra2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RigestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigest);

        TextView textView = (TextView) findViewById(R.id.gotoSignIn);
        Button button = (Button) findViewById(R.id.btnSignUp);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RigestActivity.this, SingInActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });
    }
    private void   signup() {
        String taiKhoan, pass;
        TextView textView1 = (TextView) findViewById(R.id.edtEmail);
        TextView textView2 = (TextView) findViewById(R.id.edtPassword);
        TextView textView3 = (TextView) findViewById(R.id.edtConfirmPassword);
        taiKhoan = textView1.getText().toString();
        pass = textView2.getText().toString();
        if (textView1.getText() == "" || textView2.getText() == "" || textView3.getText().equals("")){
            Toast.makeText( RigestActivity.this,"Tài khoản hoặc mật khẩu không được để trống" , Toast.LENGTH_SHORT).show();
        }
        FirebaseAuth authException = FirebaseAuth.getInstance();
        authException.createUserWithEmailAndPassword(taiKhoan, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Đăng Kí thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RigestActivity.this, SingInActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(RigestActivity.this, "Đăng kí thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}