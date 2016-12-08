package com.example.hp.product;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView, recyclerView1;
    ArrayList<Data> arrayList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerRegular);
        recyclerView1 = (RecyclerView) findViewById(R.id.recyclerRefrigerator);

        arrayList = new ArrayList<>();
        adapter = new Adapter(arrayList, MainActivity.this);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MainActivity.this, 5);
        RecyclerView.LayoutManager layoutManager1 = new GridLayoutManager(MainActivity.this, 5);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView.setHasFixedSize(true);
        recyclerView1.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView1.setAdapter(adapter);

        roughData();

    }

    private void roughData() {
        for (int i = 0; i < 20; i++) {
            Data data = new Data();
            data.setNo(""+i);
            arrayList.add(data);
        }
        adapter.notifyDataSetChanged();
    }
}
