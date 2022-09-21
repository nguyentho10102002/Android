package com.google.baitaplistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        adapter = new TraiCayAdapter(this, R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);
    }

    private void Anhxa() {
        lvTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();

        arrayTraiCay.add(new TraiCay("Dâu Tây", "Dâu tây Đà Lạt", R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Dừa sáp", "Đặc Sản Trà Vinh", R.drawable.duasap));
        arrayTraiCay.add(new TraiCay("Măng cụt", "Măng cụt miền Tây", R.drawable.mangcut));
        arrayTraiCay.add(new TraiCay("Thanh long", "Thanh long Bình Thuận", R.drawable.thanhlong));
        arrayTraiCay.add(new TraiCay("Xoài Cát", "Xoài cát thơm ngọt", R.drawable.xoaicat));

    }
    lvTraiCay.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
        @Override
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

            arrayTraiCay.remove(i);
            adapter.notifyDataSetChanged();

            return false;
        }
    });

}

