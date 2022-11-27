package com.example.myapplication.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.fragment.FragmentDowLoad;
import com.example.myapplication.fragment.FragmentMainProfile;
import com.example.myapplication.fragment.FragmentTrangChu;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Chào mừng bạn đến với wed bongdahay.vn", Toast.LENGTH_SHORT).show();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment= null;
                switch (item.getItemId()){
                    case R.id.nav_doibong:
                        selectedFragment= new FragmentTrangChu();
                        break;
                    case R.id.nav_caidat:
                        selectedFragment = new FragmentDowLoad();
                        break;
                    case R.id.nav_taikhoan:

                           selectedFragment= new FragmentMainProfile();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                return true;
            }
        });
    }
}