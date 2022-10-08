package com.example.bt_giuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MoTaDoiBongPsgActivity extends AppCompatActivity {
   private TextView txtTen , tenSan , tenHLV , mota ;
   private ImageView imgMotaAnh , imgLogo ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta_doi_bong_psg);
        txtTen= (TextView) findViewById(R.id.txtMoTaTenDoiBong);
        tenSan= (TextView) findViewById(R.id.txtMoTaSanVanDong);
        tenHLV= (TextView) findViewById(R.id.txtHuanLuyenVien);
        mota = (TextView) findViewById(R.id.txtMoTa);
        imgLogo = (ImageView) findViewById(R.id.imgMoTa);
        imgMotaAnh = (ImageView) findViewById(R.id.imgDoiBong);

        Intent intent = getIntent();
        txtTen.setText(intent.getStringExtra("key1"));
        mota.setText(intent.getStringExtra("key2"));
        imgLogo.setImageResource(intent.getIntExtra("key3",0));
        imgMotaAnh.setImageResource(intent.getIntExtra("key6",0));
        tenSan.setText(intent.getStringExtra("key4"));
        tenHLV.setText(intent.getStringExtra("key5"));
    }
}