package com.example.mappe_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buStart = (Button) findViewById(R.id.start);
/*
        buStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buStart.setText("playy");
            }
        });*/


    }


    public void start(View view) {
        Intent toStart = new Intent(this, StartActivity.class);

        startActivity(toStart);
    }


    public void prefrences(View view) {
        Intent toStart = new Intent(this, PrefrencesActivity.class);

        startActivity(toStart);
    }

    public void statistsik(View view) {
        Intent toStart = new Intent(this, StatistiskActivity.class);

        startActivity(toStart);
    }




}
