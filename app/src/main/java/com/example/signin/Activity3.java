package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Button soup1 = (Button) findViewById(R.id.soup1);
        Button soup2 = (Button) findViewById(R.id.soup2);
        Button soup3 = (Button) findViewById(R.id.soup3);
        Button soup4 = (Button) findViewById(R.id.soup4);
        Button soup5 = (Button) findViewById(R.id.soup5);
        Button soup6 = (Button) findViewById(R.id.soup6);
        soup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int0 = new Intent(Activity3.this, Soup1.class);
                startActivity(int0);
            }
        });
        soup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Activity3.this, Soup2.class);
                startActivity(int1);
            }
        });

        soup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Activity3.this, Soup3.class);
                startActivity(int3);
            }
        });

        soup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Activity3.this, Soup4.class);
                startActivity(int4);
            }
        });
        soup5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(Activity3.this, Soup5.class);
                startActivity(int5);
            }
        });
        soup6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(Activity3.this, Soup6.class);
                startActivity(int6);
            }
        });
    }
}