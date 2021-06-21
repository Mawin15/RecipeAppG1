package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button appetizer1 = (Button)findViewById(R.id.appetizer1);
        Button appetizer2 = (Button)findViewById(R.id.appetizer2);
        Button appetizer3 = (Button)findViewById(R.id.appetizer3);
        Button appetizer4 = (Button)findViewById(R.id.appetizer4);
        Button appetizer5 = (Button)findViewById(R.id.appetizer5);
        Button appetizer6 = (Button)findViewById(R.id.appetizer6);
        appetizer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int0 = new Intent(Activity2.this,App1.class);
                startActivity(int0);
            }
        });
        appetizer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Activity2.this,App2.class);
                startActivity(int2);
            }
        });
        appetizer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Activity2.this,App3.class);
                startActivity(int3);
            }
        });

        appetizer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Activity2.this,App4.class);
                startActivity(int4);
            }
        });
        appetizer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(Activity2.this,App5.class);
                startActivity(int5);
            }
        });
        appetizer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(Activity2.this,App6.class);
                startActivity(int6);
            }
        });
    }
}