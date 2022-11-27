package com.example.myapplication.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MoTaDoiBong extends AppCompatActivity {
    ImageView imgMoTa;
    TextView txt_tenDoiBongMota,txt_moTaChiTiet,txt_moTa,txt_dung_luong;
    Button btn_caiDatGame;
    ImageButton imgmp4;
    VideoView vdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta_doi_bong);
        imgMoTa =(ImageView) findViewById(R.id.imgMoTa);
        txt_tenDoiBongMota =(TextView) findViewById(R.id.txtMoTaTenDoiBong);
        txt_moTaChiTiet =(TextView) findViewById(R.id.txtMoTaDoiBong);
        txt_moTa =(TextView) findViewById(R.id.txt_mo_ta);
        txt_dung_luong =(TextView) findViewById(R.id.txt_san_van_dong);
        Intent intent =getIntent();
        imgMoTa.setImageResource(intent.getIntExtra("key1",0));
        txt_tenDoiBongMota.setText(intent.getStringExtra("key2"));
        txt_moTaChiTiet.setText(intent.getStringExtra("key3"));
        txt_moTa.setText(intent.getStringExtra("key4"));
        txt_dung_luong.setText(intent.getStringExtra("key5"));
        btn_caiDatGame =(Button) findViewById(R.id.btn_xemthem);
        imgmp4 =(ImageButton) findViewById(R.id.imgmp4);
        vdView =(VideoView) findViewById(R.id.vdAnhViDeo);
        imgmp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmp4.setVisibility(View.INVISIBLE);
                switch (txt_tenDoiBongMota.getText().toString()) {
                    case "Real Madrid": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.csgo));
                        break;
                    }
                    case "Bayern Munich": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.ffo));
                        break;
                    }
                    case "Paris Saint Germain": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.lienminh));
                        break;
                    }
                    case "Liverpool": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.gta5));
                        break;
                    }
                    case "Chelsea": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.minecraf));
                        break;
                    }
                    case "Manchester United": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.warcraft));
                        break;
                    }
                    case "Manchester City": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.ff));
                        break;
                    }
                    case "Barcelona": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.lienquan1));
                        break;
                    }
                    case "Juventus": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.lienminh));
                        break;
                    }
                }
                vdView.start();
                MediaController mediaController = new MediaController(MoTaDoiBong.this);
                mediaController.setMediaPlayer(vdView);
                vdView.setMediaController(mediaController);
            }
        });
        btn_caiDatGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                switch (txt_tenDoiBongMota.getText().toString()){
                    case "Real Madrid":{
                        intent.setData(Uri.parse("https://www.buff.game/csgo/?utm_source=google_GO&utm_medium=cpc&utm_campaign=18077161822&utm_content=Buff_AW&PartnerId=3762&gclid=CjwKCAjw4c-ZBhAEEiwAZ105Rf2VdqkcmZg-Jy1z9GpypG9icMWKjoCGiBm_wk8lGpVA71OrSdVvzhoCdRwQAvD_BwE"));
                        break;
                    }
                    case "Bayern Munich":{
                        intent.setData(Uri.parse("https://fo4.garena.vn/"));
                        break;
                    }
                    case "Paris Saint Germain":{
                        intent.setData(Uri.parse("https://vi.wikipedia.org/wiki/Paris_Saint-Germain_F.C."));
                        break;
                    }
                    case "Liverpool":{
                        intent.setData(Uri.parse("https://taimienphi.vn/download-grand-theft-auto-vice-city-8377"));
                        break;
                    }
                    case "Chelsea":{
                        intent.setData(Uri.parse("https://minefc.com/tai-game/"));
                        break;
                    }
                    case "Manchester United":{
                        intent.setData(Uri.parse("https://taimienphi.vn/download-warcraft-iii-the-frozen-throne-8342"));
                        break;
                    }
                    case "Manchester City":{
                        intent.setData(Uri.parse("https://vn.bignox.com/pg/gg-freefire?https://vn.bignox.com/&gclid=CjwKCAjw4c-ZBhAEEiwAZ105ReI5BQQXux0G3OU5U2FPslbD1__coy6L-1LcABjrdTX7Z1xUeFe_FhoCm18QAvD_BwE"));
                        break;
                    }
                    case "Barcelona":{
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.garena.game.kgvn&hl=vi&gl=US"));
                        break;
                    }
                    case "Juventus":{
                        intent.setData(Uri.parse("https://lienminh.garena.vn/download"));
                        break;
                    }
                }
                startActivity(intent);
            }
        });
    }

}