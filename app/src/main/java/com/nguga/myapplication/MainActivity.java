package com.nguga.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_item;

    ItemAdapter itemAdapter = new ItemAdapter();
    FastAdapter fastAdapter =FastAdapter.with(itemAdapter);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_item = findViewById(R.id.rv_item);

        itemAdapter.add(new Adapter());
        rv_item.setAdapter(fastAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        rv_item.setLayoutManager(layoutManager);


    }

}
