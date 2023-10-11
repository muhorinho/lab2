package com.muhammedbuga.listviewexample;

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
        Button arrayAdapterButton = findViewById(R.id.arrayAdapterButton);
        Button customAdapterButton = findViewById(R.id.customAdapterButton);

        arrayAdapterButton.setOnClickListener(v -> {
            // ArrayAdapter düğmesine tıklandığında ArrayAdapterActivity'yi aç
            Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
            startActivity(intent);
        });
        customAdapterButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
            startActivity(intent);
        });




    }

}