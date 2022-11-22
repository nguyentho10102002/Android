package com.example.bt_giuaky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CaSiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<list_Ca_Si> caSiList;
    int vittri = -1 ;
    public CaSiAdapter(Context context, int layout, List<list_Ca_Si> caSiList) {
        this.context = context;
        this.layout = layout;
        this.caSiList = caSiList;
    }

    @Override
    public int getCount() {
        return caSiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen, txtMoTa,txtSVĐ,txtHLV;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            holder.txtMoTa = (TextView) view.findViewById(R.id.textviewNgheDanh);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
            holder.txtSVĐ = (TextView) view.findViewById(R.id.textviewQuocGia);
            holder.txtHLV = (TextView) view.findViewById(R.id.textviewSao);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        list_Ca_Si caSi = caSiList.get(i);
        holder.txtTen.setText(caSi.getTen());
        holder.txtMoTa.setText(caSi.getNgheDanh());
        holder.imgHinh.setImageResource(caSi.getHinh());
        holder.txtSVĐ.setText(caSi.getQuocGia());
        holder.txtHLV.setText(caSi.getSaoBinhChon());

        return view;
    }
}
