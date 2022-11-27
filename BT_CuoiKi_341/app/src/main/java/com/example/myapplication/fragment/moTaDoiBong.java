package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link moTaDoiBong#newInstance} factory method to
 * create an instance of this fragment.
 */
public class moTaDoiBong extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String name , stadium , trainer , illustration ,imgmotachitiet,motachitiet;
    public moTaDoiBong() {
        // Required empty public constructor
    }

    public moTaDoiBong(String name, String stadium, String trainer, String illustration, String imgmotachitiet, String motachitiet) {
        this.name = name;
        this.stadium = stadium;
        this.trainer = trainer;
        this.illustration = illustration;
        this.imgmotachitiet = imgmotachitiet;
        this.motachitiet = motachitiet;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment moTaDoiBong.
     */
    // TODO: Rename and change types and number of parameters
    public static moTaDoiBong newInstance(String param1, String param2) {
        moTaDoiBong fragment = new moTaDoiBong();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mo_ta_doi_bong1, container, false);

        ImageView imgMota=view.findViewById(R.id.imgMoTa);
        ImageView imageholder1=view.findViewById(R.id.imgmotachitiet);
        TextView nameholder=view.findViewById(R.id.txtMoTaTenDoiBong);
        TextView courseholder=view.findViewById(R.id.txt_mo_ta);
        TextView emailholder=view.findViewById(R.id.txt_san_van_dong);
        TextView moTachiTiet=view.findViewById(R.id.motachitiet);

        nameholder.setText(name);
        courseholder.setText(stadium);
        emailholder.setText(trainer);
        moTachiTiet.setText(motachitiet);
        Glide.with(getContext()).load(illustration).into(imgMota);
        Glide.with(getContext()).load(imgmotachitiet).into(imageholder1);

        return  view;    }
}