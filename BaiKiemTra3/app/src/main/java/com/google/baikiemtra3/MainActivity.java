package com.google.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String nuoc[];
    RecyclerView recyclerView;
    int images[] = {R.drawable.vietnam , R.drawable.phap ,R.drawable.nga,R.drawable.anh , R.drawable.my , R.drawable.trung ,R.drawable.arg};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        nuoc = getResources().getStringArray(R.array.textviewTen);
        CountryAdapter countryAdapter = new CountryAdapter(nuoc, images, this);
        recyclerView.setAdapter(countryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}