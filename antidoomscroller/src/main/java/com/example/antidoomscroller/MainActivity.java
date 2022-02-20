package com.example.antidoomscroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View stars;
    private View background;
    private int shortAnimationDuration;
    private View button1;

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, SecondActivity.class);
        startActivity(switchActivityIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stars = findViewById(R.id.stars);
        background = findViewById(R.id.background);
        button1 = findViewById(R.id.button2);
        button1.setVisibility(View.GONE);
        background.setVisibility(View.VISIBLE);
        stars.setVisibility(View.GONE);
        shortAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime)*10;

        stars.setAlpha(0f);
        button1.setAlpha(0f);
        stars.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        stars.animate().alpha(1f).setDuration(shortAnimationDuration).setListener(null);
        button1.animate().alpha(1f).setDuration(shortAnimationDuration).setListener(null);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }
}
