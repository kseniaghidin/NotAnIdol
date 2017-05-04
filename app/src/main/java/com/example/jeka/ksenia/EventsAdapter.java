package com.example.jeka.ksenia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventsViewHolder> {
    ArrayList<Events> events = new ArrayList<Events>();

    public EventsAdapter(ArrayList<Events> events) {
        this.events = events;
    }

    @Override
    public EventsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view_event = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_events, parent, false);
        EventsViewHolder eventsViewHolder = new EventsViewHolder(view_event);
        return eventsViewHolder;
    }

    @Override
    public void onBindViewHolder(EventsViewHolder holder, int position) {
        Events event = events.get(position);
        holder.bindEvent(event);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public static class EventsViewHolder extends RecyclerView.ViewHolder {
        TextView item_month;
        TextView item_date;
        TextView item_name;
        TextView item_time;
        CardView cardViewEvents;

        public EventsViewHolder(View itemView) {
            super(itemView);

            item_month = (TextView) itemView.findViewById(R.id.item_month);
            item_date = (TextView) itemView.findViewById(R.id.item_date);
            item_name = (TextView) itemView.findViewById(R.id.item_name);
            item_time = (TextView) itemView.findViewById(R.id.item_time);
            cardViewEvents = (CardView) itemView.findViewById(R.id.card_view_events);
        }

        public void bindEvent(final Events event) {
            item_month.setText(event.getMonth());
            item_date.setText(event.getDate());
            item_name.setText(event.getEvent_name());
            item_time.setText(event.getTime());

            cardViewEvents.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(event.getLink()));
                    itemView.getContext().startActivity(intent2);
                }
            });
        }
    }
}
