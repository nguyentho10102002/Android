package com.google.baikiemtra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MoTaChiTietActivity extends AppCompatActivity {
    private TextView txtTen , tenSan , tenHLV , mota ;
    private ImageView imgMotaAnh , imgLogo ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta_chi_tiet);
        txtTen= (TextView) findViewById(R.id.txtMoTaTenCaSi);
        tenSan= (TextView) findViewById(R.id.txtNgheDanh);
        tenHLV= (TextView) findViewById(R.id.txtSao);
        mota = (TextView) findViewById(R.id.txtMoTa);
        imgLogo = (ImageView) findViewById(R.id.imgMoTa);
        imgMotaAnh = (ImageView) findViewById(R.id.imgCaSi);

        Intent intent = getIntent();
        txtTen.setText(intent.getStringExtra("key1"));
        mota.setText(intent.getStringExtra("key2"));
        imgLogo.setImageResource(intent.getIntExtra("key3",0));
        imgMotaAnh.setImageResource(intent.getIntExtra("key6",0));
        tenSan.setText(intent.getStringExtra("key4"));
        tenHLV.setText(intent.getStringExtra("key5"));
    }
}