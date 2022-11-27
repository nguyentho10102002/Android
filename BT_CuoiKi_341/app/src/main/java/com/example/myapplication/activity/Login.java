package com.example.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    private EditText emailedit, passedit;
    private Button btnlogin , btnregis ;
    private FirebaseAuth mAuth;
    private TextView editTextForgotPassword;
    private ImageView imageViewFbLogin,imageViewEmailLogin;
    private ImageButton imageButtonMat,imageButtonNhamMat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_sign_in);

        mAuth = FirebaseAuth.getInstance();
        emailedit= (EditText) findViewById(R.id.edtUserName);
        passedit= (EditText) findViewById(R.id.edtPassword);
        btnlogin= (Button) findViewById(R.id.btnSignIn);
        btnregis =(Button) findViewById(R.id.btnSignIn_SignUp);
        imageViewFbLogin=(ImageView) findViewById(R.id.imgfblogin);
        imageViewEmailLogin=(ImageView) findViewById(R.id.imggmaillogin);
        imageButtonMat=(ImageButton) findViewById(R.id.imgMat);
        imageButtonNhamMat=(ImageButton) findViewById(R.id.imgNhamMat);
        editTextForgotPassword=(TextView) findViewById(R.id.forgotPassword);
        imageButtonNhamMat.setVisibility(View.INVISIBLE);
        controlButton();

            }

    private void  controlButton() {
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
        imageButtonMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passedit.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                imageButtonNhamMat.setVisibility(View.VISIBLE);
                imageButtonMat.setVisibility(View.INVISIBLE);
            }
        });
        imageButtonNhamMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passedit.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                imageButtonNhamMat.setVisibility(View.INVISIBLE);
                imageButtonMat.setVisibility(View.VISIBLE);
            }
        });

    }

    private void register() {
        Intent intent = new Intent(Login.this, SignUp.class);
        startActivity(intent);
    }

    private void login(){
        String email , pass ;
        email =  emailedit.getText().toString();
        pass  = passedit.getText().toString();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Vui long nhập email!!!",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pass)){
            Toast.makeText(this,"Vui lòng nhập password!!!",Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    //  Toast.makeText(getApplicationContext(),"Đăng nhập thành công!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }else {
                    // Toast.makeText(getApplicationContext(),"Đăng nhập không thành công!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}