package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HotelActivity extends AppCompatActivity {

    private CardView cinnamon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        cinnamon = (CardView) findViewById(R.id.cinamon);

        cinnamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CinnamonActivity.class );
                startActivity(intent);
            }
        });
    }
}
