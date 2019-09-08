package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    private CardView flight;
    private CardView chat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        flight=(CardView)findViewById(R.id.flight_id);
        chat=(CardView)findViewById(R.id.chat_id);
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


    }
}
