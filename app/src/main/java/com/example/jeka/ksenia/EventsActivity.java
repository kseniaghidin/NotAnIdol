package com.example.jeka.ksenia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {
    RecyclerView recyclerViewEvents;
    RecyclerView.Adapter adapterEvents;
    RecyclerView.LayoutManager layoutManagerEvents;

    ArrayList<Events> eventList = new ArrayList<Events>();

    String[] month;
    String[] date;
    String[] event_name;
    String[] time;
    String[] link2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getSupportActionBar().setElevation(0);

        month = getResources().getStringArray(R.array.item_month);
        date = getResources().getStringArray(R.array.item_date);
        event_name = getResources().getStringArray(R.array.item_name);
        time = getResources().getStringArray(R.array.item_time);
        link2 = getResources().getStringArray(R.array.item_event_link);
        int cout_num = 0;
        for (String EventName : event_name) {
            Events even = new Events(month[cout_num], date[cout_num], EventName, time[cout_num], link2[cout_num]);
            cout_num++;
            eventList.add(even);
        }

        recyclerViewEvents = (RecyclerView) findViewById(R.id.recycler_view_events);
        layoutManagerEvents = new LinearLayoutManager(this);
        recyclerViewEvents.setLayoutManager(layoutManagerEvents);
        recyclerViewEvents.setHasFixedSize(true);
        adapterEvents = new EventsAdapter(eventList);
        recyclerViewEvents.setAdapter(adapterEvents);
    }
}
