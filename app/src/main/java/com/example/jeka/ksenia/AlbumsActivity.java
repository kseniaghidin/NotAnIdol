package com.example.jeka.ksenia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Albums> list = new ArrayList<Albums>();

    int[] image_id = {R.drawable.sal_vad, R.drawable.valuri};
    String[] title;
    String[] detail;
    String[] link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        getSupportActionBar().setElevation(0);

        title = getResources().getStringArray(R.array.item_title);
        detail = getResources().getStringArray(R.array.item_detail);
        link = getResources().getStringArray(R.array.item_link);
        int count = 0;
        for (String Title : title) {
            Albums albums = new Albums(image_id[count], Title, detail[count], link[count]);
            count++;
            list.add(albums);
        }

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new AlbumsAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}