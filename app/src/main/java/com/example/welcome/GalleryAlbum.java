package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GalleryAlbum extends AppCompatActivity {

    private CardView lColombo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_album);

        lColombo=(CardView)findViewById(R.id.lColombo);

        lColombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lColombo= new Intent(getApplicationContext(),Gallary.class);
                startActivity(lColombo);
            }
        });
    }

}
