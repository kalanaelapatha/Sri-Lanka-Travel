package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Country_Info_Activities extends AppCompatActivity {

    String[] mobileArray = {"Visa", "Health", "Warnings", "Rules",
            "Immigration", "Passport"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country__info__activities);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = listView.getItemAtPosition(i).toString();
                WebView webView;

                switch (s) {
                    case "Visa":
                        webView = new WebView(getApplicationContext());
                        setContentView(webView);
                        webView.loadUrl("http://www.immigration.gov.lk/web/index.php?option=com_content&view=article&id=151&Itemid=196&lang=en");
                        break;
                    case "Health":
                        webView = new WebView(getApplicationContext());
                        setContentView(webView);
                        webView.loadUrl("http://www.health.gov.lk/moh_final/english/");
                        break;
                    case "Warnings":
                        webView = new WebView(getApplicationContext());
                        setContentView(webView);
                        webView.loadUrl("https://lk.usembassy.gov/u-s-citizen-services/security-and-travel-information/");
                        break;
                    case "Rules":
                        webView = new WebView(getApplicationContext());
                        setContentView(webView);
                        webView.loadUrl("https://www.srilanka.travel/travel-tips");
                        break;
                    case "Immigration":
                        webView = new WebView(getApplicationContext());
                        setContentView(webView);
                        webView.loadUrl("http://www.immigration.gov.lk");
                        break;
                    case "Passport":
                        webView = new WebView(getApplicationContext());
                        setContentView(webView);
                        webView.loadUrl("http://www.immigration.gov.lk/web/index.php?option=com_content&view=article&id=137&Itemid=190&lang=en");
                        break;
                }
            }
        });
    }
}
