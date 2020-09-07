package com.example.mappe_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);





    }

    @Override
    protected void onStart() {
        super.onStart();
        String [] regnStykke = getResources().getStringArray(R.array.regnstykker);
        Random r = new Random();
        TextView viewRengstykke = (TextView) findViewById(R.id.textView5);


        viewRengstykke.setText(regnStykke[ r.nextInt(25)]);

        Log.d("aa", regnStykke[ r.nextInt(regnStykke.length)]);
    }
}