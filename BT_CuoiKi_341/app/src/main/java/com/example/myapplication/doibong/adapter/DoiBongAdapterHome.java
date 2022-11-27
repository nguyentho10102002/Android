package com.example.myapplication.doibong.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.doibong.model.DoiBong1;

import java.util.ArrayList;
import java.util.List;

public class DoiBongAdapterHome extends ArrayAdapter<DoiBong1> {

    private Context context;
    private ArrayList<DoiBong1> DoiBongArrayList;

    public DoiBongAdapterHome(@NonNull Context context, int resource, @NonNull List<DoiBong1> objects) {
        super(context, resource, objects);
        this.context= context;
        this.DoiBongArrayList= new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView ==null){
            LayoutInflater layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= layoutInflater.inflate(R.layout.item_doi_bong,null);
        }
        if(DoiBongArrayList.size()>0){
            DoiBong1 doiBong1 = this.DoiBongArrayList.get(position);

            ImageView imgdoibong =(ImageView) convertView.findViewById(R.id.img_doibong);
            TextView txtTenDoiBong=(TextView) convertView.findViewById(R.id.txt_tenDoiBong);
            TextView txtMoTa=(TextView) convertView.findViewById(R.id.txt_moTa);
            imgdoibong.setImageResource(doiBong1.getImg());
            txtTenDoiBong.setText(doiBong1.getTenDoiBong());
            txtMoTa.setText(doiBong1.getMoTa());
        }
        return convertView;
    }
}

