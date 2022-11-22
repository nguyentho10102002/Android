package com.example.bt_giuaky;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TrangChuFragment extends Fragment {

    final String mytam="Cá rô phi có thân hình màu hơi tím, vảy sáng bóng, có 9-12 sọc đậm song song nhau từ lưng xuống bụng.";
    final String bichphuong="Chép là loài ăn tạp, chúng ăn gần như mọi thứ khi chúng bơi ngang qua, bao gồm các loại thực vật thủy sinh, côn trùng, giáp xác.";
    final String suboi="Chúng có bản tính ăn tạp và hung dữ, thường ăn những loài động vật nhỏ hơn mình.";

    ListView lvCaSi;
    List<list_Ca_Si> arrayCaSi;
    CaSiAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_trang_chu_fragment,container,false);
        lvCaSi = (ListView) view.findViewById(R.id.listviewCaSi);
        Danhsach();
        adapter = new CaSiAdapter(getContext(), R.layout.dong_ca_si, arrayCaSi);
        lvCaSi.setAdapter(adapter);
        lvCaSi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), MainActivity_Mo_ta_ca.class);
                intent.putExtra("key1", arrayCaSi.get(i).getTen());
                intent.putExtra("key2", arrayCaSi.get(i).getMoTaChiTiet());
                intent.putExtra("key3", arrayCaSi.get(i).getHinh());
                intent.putExtra("key4", arrayCaSi.get(i).getQuocGia());
                intent.putExtra("key5", arrayCaSi.get(i).getSaoBinhChon());
                intent.putExtra("key6", arrayCaSi.get(i).getAnhChiTiet());
                startActivity(intent);
            }
        });
        return view;
//
    }

    private void Danhsach() {
        arrayCaSi = new ArrayList<>();
        arrayCaSi.add(new list_Ca_Si("Cá rô phi", "Oreochromis niloticus", R.drawable.carophi,"màu xanh","5 Sao",mytam,R.drawable.carophi));
        arrayCaSi.add(new list_Ca_Si("Cá chép", "Cyprinus carpio", R.drawable.carophi,"màu vàng","5 Sao",bichphuong,R.drawable.carophi));
        arrayCaSi.add(new list_Ca_Si("Cá quả", "Channidae", R.drawable.carophi,"màu đen","5 Sao",suboi,R.drawable.suboi));
        arrayCaSi.add(new list_Ca_Si("Cá rô phi", "Cyprinus carpio", R.drawable.carophi,"màu xanh","5 Sao",mytam,R.drawable.carophi));
        arrayCaSi.add(new list_Ca_Si("Cá chép", "Thánh nữ nhạc sầu", R.drawable.carophi,"màu vàng","5 Sao",bichphuong,R.drawable.carophi));
        arrayCaSi.add(new list_Ca_Si("Cá quả", "Channidae", R.drawable.carophi,"màu đen","5 Sao",suboi,R.drawable.suboi));


    }

}