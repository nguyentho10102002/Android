package com.example.myapplication.doibong.adapter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.doibong.model.DoiBong;
import com.example.myapplication.fragment.moTaDoiBong;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.ViewHolder;

import java.util.HashMap;
import java.util.Map;

public class DoiBongAdapterDowload extends FirebaseRecyclerAdapter<DoiBong , DoiBongAdapterDowload.myviewholder> {

        /**
         * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
         * {@link FirebaseRecyclerOptions} for configuration options.
         *
         * @param options
         */
        public DoiBongAdapterDowload(@NonNull FirebaseRecyclerOptions<DoiBong> options) {
            super(options);
        }

        @Override
        protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull DoiBong model) {
            holder.nametext.setText(model.getName());
            holder.coursetext.setText(model.getStadium());
            holder.emailtext.setText(model.getTrainer());
            Glide.with(holder.img1.getContext()).load(model.getIllustration()).into(holder.img1);

            holder.img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AppCompatActivity activity=(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new moTaDoiBong(model.getName(),model.getStadium(),model.getTrainer(),model.getIllustration(), model.getImgmotachitiet(), model.getMotachitiet())).addToBackStack(null).commit();
                }
            });

            holder.btnEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final DialogPlus dialogPlus = DialogPlus.newDialog(holder.img1.getContext())
                            .setContentHolder(new ViewHolder(R.layout.update))
                            .setExpanded(true,1200)
                            .create();
                    View view = dialogPlus.getHolderView();
                    EditText name = view.findViewById(R.id.txtName);
                    EditText stadium = view.findViewById(R.id.txtStadium);
                    EditText trainer = view.findViewById(R.id.txtTrainer);
                    EditText illustration = view.findViewById(R.id.txtIllustration);

                    Button btnUpDate = view.findViewById(R.id.btnUpDate);
                    name.setText(model.getName());
                    trainer.setText(model.getTrainer());
                    stadium.setText(model.getStadium());
                    illustration.setText(model.getIllustration());

                    dialogPlus.show();
                    btnUpDate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Map<String,Object> map = new HashMap<>();
                            map.put("name",name.getText().toString());
                            map.put("stadium",stadium.getText().toString());
                            map.put("trainer",trainer.getText().toString());
                            map.put("illustration",illustration.getText().toString());

                            FirebaseDatabase.getInstance().getReference().child("football")
                                    .child(getRef(position).getKey()).updateChildren(map)
                                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                                        @Override
                                        public void onSuccess(Void unused) {
                                            Toast.makeText(holder.nametext.getContext(), "Data Updated Successfully", Toast.LENGTH_SHORT).show();
                                            dialogPlus.dismiss();
                                        }
                                    })
                                    .addOnFailureListener(new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                                            Toast.makeText(holder.nametext.getContext(), "Data Updated Error", Toast.LENGTH_SHORT).show();
                                            dialogPlus.dismiss();
                                        }
                                    });
                        }
                    });
                }
            });
            holder.btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(holder.nametext.getContext());
                    builder.setTitle("Are you Sure ?");
                    builder.setMessage("Detele data can't be Undo");

                    builder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            FirebaseDatabase.getInstance().getReference().child("football")
                                    .child(getRef(position).getKey()).removeValue();

                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(holder.nametext.getContext(), "Cancel", Toast.LENGTH_SHORT).show();

                        }
                    });
                    builder.show();
                }
            });
        }

        @NonNull
        @Override
        public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_dong_doi_bong3,parent,false);
            return new myviewholder(view);
        }

        public class myviewholder extends RecyclerView.ViewHolder {
            ImageView img1;
            TextView nametext,coursetext,emailtext;
            Button btnEdit,btnDelete,btnUD;
            public myviewholder(@NonNull View itemView) {

                super(itemView);
                img1=itemView.findViewById(R.id.img);
                nametext=itemView.findViewById(R.id.name);
                coursetext=itemView.findViewById(R.id.stadium);
                emailtext=itemView.findViewById(R.id.trainer);
                btnEdit = itemView.findViewById(R.id.btnEdit);
                btnDelete = itemView.findViewById(R.id.btnDelete);

            }
        }
    }

