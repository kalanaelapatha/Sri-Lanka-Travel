package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    private CardView flight;
    private CardView maps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        flight=(CardView)findViewById(R.id.flight_id);
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent flight_id= new Intent(getApplicationContext(),Flight.class);
                startActivity(flight_id);


            }
        });

        maps=(CardView)findViewById(R.id.map_id);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map_id= new Intent(getApplicationContext(),MapActivity.class);
                startActivity(map_id);


            }
        });


    }
}
