package com.example.welcome;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;

public class PlacesHome extends AppCompatActivity {

    private CardView kandy;
    private CardView ella;
    private CardView pasikuda;
    private CardView trincomalee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        kandy =(CardView)findViewById(R.id.kandy_id_view);
        ella =(CardView)findViewById(R.id.ella_id_view);
        pasikuda =(CardView)findViewById(R.id.pasikuda_id_view);
        trincomalee = (CardView)findViewById(R.id.tincomalee_id_view);


        kandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kandy_activity_details = new Intent(getApplicationContext(),Kandy_Places_Activity.class);
                startActivity(kandy_activity_details);


            }
        });

        ella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ELLA_activity_details = new Intent(getApplicationContext(),Ella_Places_Activity.class);
                startActivity(ELLA_activity_details);


            }
        });

        pasikuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasikuda_activity_details = new Intent(getApplicationContext(),Pasikuda_Places_Activity.class);
                startActivity(pasikuda_activity_details);


            }
        });

        trincomalee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trincomalee_activity_details = new Intent(getApplicationContext(),Trincomalee_Places_Activity.class);
                startActivity(trincomalee_activity_details);


            }
        });




    }

}
