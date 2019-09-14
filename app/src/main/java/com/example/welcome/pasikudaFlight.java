package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.Toast;

public class pasikudaFlight extends AppCompatActivity {

    private TableRow clickToConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasikuda_flight);

        clickToConnect = (TableRow) findViewById(R.id.clickRow1);
        clickToConnect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "Payment Gatway Loading..." , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
