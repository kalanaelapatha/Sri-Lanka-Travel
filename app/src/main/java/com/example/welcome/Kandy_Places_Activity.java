package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kandy_Places_Activity extends AppCompatActivity {

    Button hotels;
    Button gallery;
    Button maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kandy__places_);

        hotels = (Button) findViewById(R.id.hotels_id_btn);
        gallery = (Button) findViewById(R.id.gallery_id_btn);
        maps = (Button) findViewById(R.id.maps_id_btn);

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotels = new Intent(getApplicationContext(), Flight.class);
                startActivity(hotels);
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallery = new Intent(getApplicationContext(), GalleryAlbum.class);
                startActivity(gallery);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maps = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(maps);
            }
        });

    }


}
