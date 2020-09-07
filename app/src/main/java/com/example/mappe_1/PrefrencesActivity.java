package com.example.mappe_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PrefrencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prefrences);

        final String [] regnStykker = getResources().getStringArray(R.array.regnstykker);

        final TextView viewRegnStykke = (TextView) findViewById(R.id.textView3);

        Button buBB = (Button) findViewById(R.id.button8);

        buBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (String s : regnStykker){
                    viewRegnStykke.append(s+"  ");
                    Log.d("ahha", s);
                }
            }
        });

    }
}