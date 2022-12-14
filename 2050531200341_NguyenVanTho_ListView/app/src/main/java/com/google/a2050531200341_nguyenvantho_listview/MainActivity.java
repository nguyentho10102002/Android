package com.google.a2050531200341_nguyenvantho_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    TextView editText;
    Button btthem,btcapnhat, btnxoa;
    ArrayList<String> arrayList;
    int vitri = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = (ListView) findViewById(R.id.listviewMonHoc);
        editText = (TextView) findViewById(R.id.edtext);
        btthem = (Button) findViewById(R.id.them);
        btcapnhat = (Button) findViewById(R.id.capnhat);
        btnxoa = (Button) findViewById(R.id.xoa);
        arrayList = new ArrayList<>();
        arrayList.add("PHP");
        arrayList.add("JAVA");
        arrayList.add("PYTHON");
        arrayList.add("C++");
        arrayList.add("HTML");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });
        lv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Long list: " + i, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        btthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String monhoc = editText.getText().toString();
                if(monhoc.isEmpty())
                    Toast.makeText(MainActivity.this, "B???n ch??a nh???p m??n h???c", Toast.LENGTH_SHORT).show();
                else{
                    arrayList.add(monhoc);
                    adapter.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this, "???? th??m v??o th??nh c??ng", Toast.LENGTH_SHORT).show();
                    editText.setText("");
                }

            }
        });

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editText.setText(arrayList.get(i));
                vitri = i;
            }
        });

        btcapnhat.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(vitri == -1)
                    Toast.makeText(MainActivity.this, "B???n ch??a ch???n m??n h???c c???n c???p nh???t", Toast.LENGTH_SHORT).show();
                else {
                    arrayList.set(vitri, editText.getText().toString());
                    adapter.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this, "???? c???p nh???t th??nh c??ng", Toast.LENGTH_SHORT).show();
                    editText.setText("");
                    vitri = -1;
                }
            }
        });

        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arrayList.isEmpty())
                    Toast.makeText(MainActivity.this, "Kh??ng c?? g?? ????? x??a", Toast.LENGTH_SHORT).show();
                else {
                    if(vitri == -1)
                        Toast.makeText(MainActivity.this, "B???n ch??a ch???n m??n h???c c???n x??a", Toast.LENGTH_SHORT).show();
                    else{
                        arrayList.remove(vitri);
                        adapter.notifyDataSetChanged();
                        Toast.makeText(MainActivity.this, "B???n ???? x??a th??nh c??ng", Toast.LENGTH_SHORT).show();
                        editText.setText("");
                        vitri = -1;
                    }

                }
            }
        });

        lv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("key_1", arrayList.get(i));
                startActivity(intent);
                return true;
            }
        });
    }
}