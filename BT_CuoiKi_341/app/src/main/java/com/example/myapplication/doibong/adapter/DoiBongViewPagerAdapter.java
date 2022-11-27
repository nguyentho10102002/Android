package com.example.myapplication.doibong.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.myapplication.R;
import com.example.myapplication.doibong.model.DoiBong1;

import java.util.List;

public class DoiBongViewPagerAdapter extends PagerAdapter {
    List<DoiBong1> DoiBongList;

    public DoiBongViewPagerAdapter(List<DoiBong1> doiBongList) {
        this.DoiBongList = doiBongList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from(container.getContext()).inflate(R.layout.item_photo,container,false);
        ImageView imgPhoTo =view.findViewById(R.id.img_photo);
        DoiBong1 doiBong1 = DoiBongList.get(position);
        imgPhoTo.setImageResource(doiBong1.getImg());
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        if(DoiBongList !=null){
            return  DoiBongList.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}

