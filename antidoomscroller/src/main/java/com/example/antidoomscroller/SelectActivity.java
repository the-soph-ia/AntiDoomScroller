package com.example.antidoomscroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectActivity extends AppCompatActivity{
    private View environ;
    private View sexism;
    private View politics;
    private View racism;
    private View health;
    private View poverty;

    private void switchActivitiesEnv(){
        Intent switchActivityIntent = new Intent(this, WebActivityEnv.class);
        startActivity(switchActivityIntent);
    }
    private void switchActivitiesSex(){
        Intent switchActivityIntent = new Intent(this, WebActivitySex.class);
        startActivity(switchActivityIntent);
    }
    private void switchActivitiesPol(){
        Intent switchActivityIntent = new Intent(this, WebActivityPol.class);
        startActivity(switchActivityIntent);
    }
    private void switchActivitiesRac(){
        Intent switchActivityIntent = new Intent(this, WebActivityRac.class);
        startActivity(switchActivityIntent);
    }
    private void switchActivitiesHealth(){
        Intent switchActivityIntent = new Intent(this, WebActivityHealth.class);
        startActivity(switchActivityIntent);
    }
    private void switchActivitiesPov(){
        Intent switchActivityIntent = new Intent(this, WebActivityPov.class);
        startActivity(switchActivityIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        environ = findViewById(R.id.Environment);
        sexism = findViewById(R.id.Sexism);
        politics = findViewById(R.id.Politics);
        racism = findViewById(R.id.Racism);
        health = findViewById(R.id.Health);
        poverty = findViewById(R.id.Poverty);

        environ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setUrl("https://www.positive.news/?s=environment");
                switchActivitiesEnv();
            }
        });
        sexism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setUrl("https://www.positive.news/?s=sexism");
                switchActivitiesSex();
            }

        });
        politics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setUrl("https://www.positive.news/?s=sexism");
                switchActivitiesPol();
            }
        });
        racism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setUrl("https://www.positive.news/?s=racism");
                switchActivitiesRac();
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setUrl("https://www.positive.news/?s=medicine");
                switchActivitiesHealth();
            }
        });
        poverty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setUrl("https://www.positive.news/?s=poverty");
                switchActivitiesPov();
            }
        });
    }

}