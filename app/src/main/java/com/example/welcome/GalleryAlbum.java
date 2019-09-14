package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GalleryAlbum extends AppCompatActivity {

    private CardView lColombo;
    private CardView iPolonaruwa;
    private CardView iAnuradhapura;
    private CardView iJaffna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_album);

        lColombo=(CardView)findViewById(R.id.lColombo);
        iPolonaruwa=(CardView)findViewById(R.id.iPolonnaruwa);
        iJaffna=(CardView)findViewById(R.id.iJaffna);
        iAnuradhapura=(CardView)findViewById(R.id.iAnuradhapura);

        lColombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value_1= R.id.lColombo;
                String  value=Integer.toString(value_1);
                Intent lColombo= new Intent(getApplicationContext(),Gallary.class);
                lColombo.putExtra("value", value);
                startActivity(lColombo);

            }
        });

        iPolonaruwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iPolonnaruwa= new Intent(getApplicationContext(),PolonnaruwaGallery.class);
                startActivity(iPolonnaruwa);

            }
        });

        iAnuradhapura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iAnuradhapura= new Intent(getApplicationContext(),AnuradhapuraGallery.class);
                startActivity(iAnuradhapura);

            }
        });
        iJaffna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j1= new Intent(getApplicationContext(),PolonnaruwaGallery.class);
                startActivity(j1);
            }
        });
    }

}
