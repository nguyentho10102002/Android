package com.google.baikiemtra3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.myviewholder> {
    String phepTinh[];
    int images[];
    Context context;

    public CountryAdapter(String[] phepTinh, int[] images, Context context) {
        this.phepTinh = phepTinh;
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_ngon_ngu , parent , false);
        return new  myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.phepTinh.setText(phepTinh[position]);
        holder.img.setImageResource(images[position]);
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , Detail.class);
                intent.putExtra("images" , images[position]);
                intent.putExtra("phepTinh" , phepTinh[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        TextView phepTinh;
        ImageView img;
        ConstraintLayout mainLayout;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            phepTinh = (TextView) itemView.findViewById(R.id.textviewTen);
            img = (ImageView) itemView.findViewById(R.id.imageviewHinh);
            mainLayout = (ConstraintLayout) itemView.findViewById(R.id.mainlayout);
        }
    }
}
