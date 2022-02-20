package com.example.antidoomscroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    private View stars;
    private View background;
    private int shortAnimationDuration;
    private View button2;

    private void switchActivities(){
        Intent switchActivityIntent = new Intent(this, SelectActivity.class);
        startActivity(switchActivityIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        stars = findViewById(R.id.stars);
        button2 = findViewById(R.id.button2);
        background = findViewById(R.id.background);
        button2.setVisibility(View.GONE);
        background.setVisibility(View.VISIBLE);
        stars.setVisibility(View.GONE);
        shortAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime)*10;

        stars.setAlpha(0f);
        button2.setAlpha(0f);
        stars.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        stars.animate().alpha(1f).setDuration(shortAnimationDuration).setListener(null);
        button2.animate().alpha(1f).setDuration(shortAnimationDuration).setListener(null);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchActivities();
            }
        });
    }
}