package com.google.baikiemtra2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RigestActivity extends AppCompatActivity {

    private EditText emailedit, passedit;
    private Button btnlogup  ;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigest);
        mAuth = FirebaseAuth.getInstance();

        emailedit = findViewById(R.id.EmailInput);
        passedit = findViewById(R.id.PasswordInput);
        btnlogup = findViewById(R.id.logup);
        

        btnlogup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logup();
            }
        });
        
    }

    private void logup() {
        String email , pass ;
        email =  emailedit.getText().toString();
        pass  = passedit.getText().toString();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Vui lòng nhập email!!!",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pass)){
            Toast.makeText(this,"Vui lòng nhập password!!!",Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Tạo tài khoản thành công!!!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RigestActivity.this , MainActivity.class );
                    startActivity(intent);

                }else {
                    Toast.makeText(getApplicationContext(),"Tạo tài khoản  không thành công!!!",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}