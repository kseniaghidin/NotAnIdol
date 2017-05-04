package com.example.jeka.ksenia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.AlbumsViewHolder> {
    ArrayList<Albums> albums = new ArrayList<Albums>();

    public AlbumsAdapter(ArrayList<Albums> albums) {
        this.albums = albums;
    }

    @Override
    public AlbumsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_albums, parent, false);
        AlbumsViewHolder albumsViewHolder = new AlbumsViewHolder(view);
        return albumsViewHolder;
    }

    @Override
    public void onBindViewHolder(AlbumsViewHolder holder, int position) {
        Albums alb = albums.get(position);
        holder.bind(alb);
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public static class AlbumsViewHolder extends RecyclerView.ViewHolder {
        ImageView item_image;
        TextView item_title;
        TextView item_detail;
        CardView card_view;

        public AlbumsViewHolder(View itemView) {
            super(itemView);

            item_image = (ImageView) itemView.findViewById(R.id.item_image);
            item_title = (TextView) itemView.findViewById(R.id.item_title);
            item_detail = (TextView) itemView.findViewById(R.id.item_detail);
            card_view = (CardView) itemView.findViewById(R.id.card_view);
        }

        public void bind(final Albums alb){
            item_image.setImageResource(alb.getImage_id());
            item_title.setText(alb.getTitle());
            item_detail.setText(alb.getDetail());

            card_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(alb.getLink()));
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}