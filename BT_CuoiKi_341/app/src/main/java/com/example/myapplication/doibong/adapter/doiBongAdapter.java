//package com.example.myapplication.doibong.adapter;

//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.myapplication.doibong.model.DoiBong;
//import com.firebase.ui.database.FirebaseRecyclerAdapter;
//
//import de.hdodenhof.circleimageview.CircleImageView;
//import com.example.myapplication.activity.*;
//public class doiBongAdapter extends FirebaseRecyclerAdapter<DoiBong,doiBongAdapter.myViewHolder> {
//    @Override
//    protected void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull Object model) {
//
//    }
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    public class myViewHolder {
//        CircleImageView illustration1;
//        TextView name1, stadium1, trainer1;
//        Button btnEdit,btnDelete;
//
//        public myViewHolder(@NonNull View itemView) {
//            super(itemView);
//            illustration1 = (CircleImageView) itemView.findViewById(R.id.img);
//            name1 = (TextView) itemView.findViewById(R.id.name);
//            stadium1 = (TextView) itemView.findViewById(R.id.stadium);
//            trainer1 = (TextView) itemView.findViewById(R.id.trainer);
//
//            btnEdit = (Button) itemView.findViewById(R.id.btnEdit);
//            btnDelete = (Button)itemView.findViewById(R.id.btnDelete);
//        }
//    }
//}
