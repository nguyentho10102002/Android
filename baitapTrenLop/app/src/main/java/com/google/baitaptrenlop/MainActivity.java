package com.google.baitaptrenlop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnXacNhan;
    EditText edtUsername , edtPassword ;
    CheckBox cbRemember ;

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("dataLogin",MODE_PRIVATE);

        edtUsername.setText(sharedPreferences.getString("taikhoan",""));
        edtPassword.setText(sharedPreferences.getString("matkhau",""));
        cbRemember.setChecked(sharedPreferences.getBoolean("checked",false));


        AnhXa();
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();

                if(username.equals("VanTho")&& password.equals("1234")){
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                      if(cbRemember.isChecked()){
                          SharedPreferences.Editor editor = sharedPreferences.edit();
                          editor.putString("taikhoan",username);
                          editor.putString("matkhau",password);
                          editor.putBoolean("checked",true);
                          editor.commit();
                      }else{
                          SharedPreferences.Editor editor = sharedPreferences.edit();
                          editor.remove("taikhoan");
                          editor.remove("matkhau");
                          editor.remove("checked");
                          editor.commit();
                      }
                }else{
                    Toast.makeText(MainActivity.this, "Lỗi đăng nhập", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void AnhXa(){
        btnXacNhan = (Button) findViewById(R.id.button);
        edtPassword = (EditText) findViewById(R.id.editTextPassword);
        edtUsername = (EditText) findViewById(R.id.editTextUserName);
        cbRemember = (CheckBox) findViewById(R.id.checkBoxRemember);

    }
}