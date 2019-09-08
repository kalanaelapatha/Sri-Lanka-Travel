package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Flight extends AppCompatActivity {

    private CardView pasikuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);



        pasikuda=(CardView)findViewById(R.id.pasikuda_id);

        pasikuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasikuda= new Intent(getApplicationContext(),pasikudaFlight.class);
                startActivity(pasikuda);
            }
        });
    }
}
