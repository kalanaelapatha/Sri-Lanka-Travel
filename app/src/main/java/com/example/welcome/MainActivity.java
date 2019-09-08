package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation smalltobig, nothingtocome,getting_start_btn_anim;
    TextView textView2,textView;
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smalltobig= AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        nothingtocome= AnimationUtils.loadAnimation(this,R.anim.nothingtocome);
        getting_start_btn_anim=AnimationUtils.loadAnimation(this,R.anim.getting_start_btn_anim);

        textView2=(TextView)findViewById(R.id.textView2);
        textView=(TextView)findViewById(R.id.textView);
        imageView=(ImageView)findViewById(R.id.imageView);
        button=(Button)findViewById(R.id.button);

        imageView.startAnimation(smalltobig);
        textView2.startAnimation(nothingtocome);
        textView.startAnimation(nothingtocome);
        button.startAnimation(getting_start_btn_anim);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent btn_intent= new Intent(getApplicationContext(),dashboard.class);
                startActivity(btn_intent);



            }
        });

    }
}
