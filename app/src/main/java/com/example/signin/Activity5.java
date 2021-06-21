package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        Button main1 = (Button) findViewById(R.id.main1);
        Button main2 = (Button) findViewById(R.id.main2);
        Button main3 = (Button) findViewById(R.id.main3);
        Button main4 = (Button) findViewById(R.id.main4);
        Button main5 = (Button) findViewById(R.id.main5);
        Button main6 = (Button) findViewById(R.id.main6);

        main1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int0 = new Intent(Activity5.this, course1.class);
                startActivity(int0);
            }
        });
        main2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Activity5.this, course2.class);
                startActivity(int1);
            }
        });
        main3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Activity5.this, course3.class);
                startActivity(int3);
            }
        });
        main4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Activity5.this, course4.class);
                startActivity(int4);
            }
        });
        main5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(Activity5.this, course5.class);
                startActivity(int5);
            }
        });
        main6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(Activity5.this, course6.class);
                startActivity(int6);
            }
        });
    }
}