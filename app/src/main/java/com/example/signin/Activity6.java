package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        Button spe1 = (Button) findViewById(R.id.spe1);
        Button spe2 = (Button) findViewById(R.id.spe2);
        Button spe3 = (Button) findViewById(R.id.spe3);
        Button spe4 = (Button) findViewById(R.id.spe4);
        Button spe5 = (Button) findViewById(R.id.spe5);

        spe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int0 = new Intent(Activity6.this, Special1.class);
                startActivity(int0);
            }
        });
        spe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Activity6.this, Special2.class);
                startActivity(int1);
            }
        });
        spe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int0 = new Intent(Activity6.this, Special3.class);
                startActivity(int0);
            }
        });
        spe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int0 = new Intent(Activity6.this, Special4.class);
                startActivity(int0);
            }
        });
        spe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int0 = new Intent(Activity6.this, Special5.class);
                startActivity(int0);
            }
        });

    }
}