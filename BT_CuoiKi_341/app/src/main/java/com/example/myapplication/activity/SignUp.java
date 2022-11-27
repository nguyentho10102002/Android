package com.example.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {
    private EditText email , pass , ConfirmPassword;
    private ImageButton imageButtonMatPassword,imageButtonNhamMatPassword;
    private ImageButton imageButtonMatConfirmPassword,imageButtonNhamMatConfirmPassword;
    private Button btnlogup , btnlogin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        email = (EditText) findViewById(R.id.edtEmail);
        pass = (EditText)  findViewById(R.id.edtPassword);
        ConfirmPassword = (EditText)  findViewById(R.id.edtConfirmPassword);
        imageButtonMatPassword = (ImageButton) findViewById(R.id.imgMatPassword);
        imageButtonNhamMatPassword = (ImageButton) findViewById(R.id.imgNhamMatPassword);
        imageButtonMatConfirmPassword = (ImageButton) findViewById(R.id.imgMatConfirmPassword);
        imageButtonNhamMatConfirmPassword = (ImageButton) findViewById(R.id.imgNhamMatConfirmPassword);
        btnlogin =(Button) findViewById(R.id.btnSignIn);
        btnlogup = (Button) findViewById(R.id.btnSignUp);
        btnlogup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });


                imageButtonMatPassword.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        imageButtonMatPassword.setVisibility(View.INVISIBLE);
                        imageButtonNhamMatPassword.setVisibility(View.VISIBLE);
                    }
                });
                imageButtonNhamMatPassword.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        imageButtonMatPassword.setVisibility(View.VISIBLE);
                        imageButtonNhamMatPassword.setVisibility(View.INVISIBLE);
                    }
                });
                imageButtonMatConfirmPassword.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ConfirmPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        imageButtonMatConfirmPassword.setVisibility(View.INVISIBLE);
                        imageButtonNhamMatConfirmPassword.setVisibility(View.VISIBLE);
                    }
                });
                imageButtonNhamMatConfirmPassword.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ConfirmPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        imageButtonMatConfirmPassword.setVisibility(View.VISIBLE);
                        imageButtonNhamMatConfirmPassword.setVisibility(View.INVISIBLE);
                    }
                });

            }

    private void   signup() {
        String taiKhoan, passs;
        taiKhoan = email.getText().toString();
        passs = pass.getText().toString();
        if(TextUtils.isEmpty(taiKhoan)){
            Toast.makeText(this,"Vui lòng nhập email!!!",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(passs)){
            Toast.makeText(this,"Vui lòng nhập password!!!",Toast.LENGTH_SHORT).show();
            return;
        }
        FirebaseAuth authException = FirebaseAuth.getInstance();
        authException.createUserWithEmailAndPassword(taiKhoan, passs).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Đăng Kí thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUp.this, Login.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(SignUp.this, "Đăng kí thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
