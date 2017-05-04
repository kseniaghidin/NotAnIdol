package com.example.jeka.ksenia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonVideos;
    Button buttonAlbums;
    Button buttonEvents;
    Button buttonContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonVideos = (Button) findViewById(R.id.buttonVideos);
        buttonAlbums = (Button) findViewById(R.id.buttonAlbums);
        buttonEvents = (Button) findViewById(R.id.buttonEvents);
        buttonContacts = (Button) findViewById(R.id.buttonContacts);
    }

    public void clickVideos(View view) {
        Intent intentVideos = new Intent(this, VideosActivity.class);
        startActivity(intentVideos);
    }

    public void clickAlbums(View view) {
        Intent intentAlbums = new Intent(this, AlbumsActivity.class);
        startActivity(intentAlbums);
    }

    public void clickEvents(View view) {
        Intent intentEvents = new Intent(this, EventsActivity.class);
        startActivity(intentEvents);
    }

    public void clickContacts(View view) {
        Intent intentContacts = new Intent(this, ContactsActivity.class);
        startActivity(intentContacts);
    }
}
