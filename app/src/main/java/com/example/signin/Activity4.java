package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Button dessert1 = (Button) findViewById(R.id.dessert1);
        Button dessert2 = (Button) findViewById(R.id.dessert2);
        Button dessert3 = (Button) findViewById(R.id.dessert3);
        Button dessert4 = (Button) findViewById(R.id.dessert4);
        Button dessert5 = (Button) findViewById(R.id.dessert5);
        Button dessert6 = (Button) findViewById(R.id.dessert6);
        dessert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int0 = new Intent(Activity4.this, Dessert1.class);
                startActivity(int0);
            }
        });
        dessert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Activity4.this, Dessert2.class);
                startActivity(int1);
            }
        });
        dessert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Activity4.this, Dessert3.class);
                startActivity(int2);
            }
        });
        dessert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Activity4.this, Dessert3.class);
                startActivity(int3);
            }
        });

        dessert4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Activity4.this, Dessert4.class);
                startActivity(int4);
            }
        });
        dessert5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(Activity4.this, Dessert5.class);
                startActivity(int5);
            }
        });
        dessert6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(Activity4.this, Dessert6.class);
                startActivity(int6);
            }
        });
    }
}