package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    private CardView flight;
    private CardView chat;

    private CardView maps;
    private CardView galleryAlbum;

    private CardView places;
    private CardView countries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        flight=(CardView)findViewById(R.id.flight_id);
        chat=(CardView)findViewById(R.id.chat_id);
        maps=(CardView)findViewById(R.id.map_id);
        galleryAlbum=(CardView)findViewById(R.id.gallery_id);
        places =(CardView)findViewById(R.id.places_id);
        countries =(CardView)findViewById(R.id.countries_id);


        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent flight_id= new Intent(getApplicationContext(),Flight.class);
                startActivity(flight_id);


            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chat_id= new Intent(getApplicationContext(),Chat.class);
                startActivity(chat_id);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map_id= new Intent(getApplicationContext(),MapActivity.class);
                startActivity(map_id);


            }
        });

        galleryAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallery_id= new Intent(getApplicationContext(),GalleryAlbum.class);
                startActivity(gallery_id);
            }
        });

        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent places_id= new Intent(getApplicationContext(),PlacesHome.class);
                startActivity(places_id);
            }
        });

        countries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent countries_id= new Intent(getApplicationContext(),Country_Info_Activities.class);
                startActivity(countries_id);
            }
        });

    }
}
