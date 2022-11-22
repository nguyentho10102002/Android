package com.google.baikiemtra2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel,MainAdapter.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel model) {
        holder.tenthuonggoi.setText(model.getTenthuonggoi());
        holder.tenkhoahoc.setText(model.getTenkhoahoc());
        holder.mauca.setText(model.getMauca());


        Glide.with(holder.hinhanh.getContext())
                .load(model.getHinhanh())
                .placeholder(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark)
                .circleCrop()
                .error(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.hinhanh);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent,false);
        return null;
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        CircleImageView hinhanh;
        TextView tenthuonggoi, tenkhoahoc, mauca;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            hinhanh = (CircleImageView) itemView.findViewById(R.id.img);
            tenthuonggoi = (TextView) itemView.findViewById(R.id.name);
            tenkhoahoc = (TextView) itemView.findViewById(R.id.stadium);
            mauca = (TextView) itemView.findViewById(R.id.trainer);


        }
    }


}
