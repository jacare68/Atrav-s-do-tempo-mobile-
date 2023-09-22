package com.example.atravesdotempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void periodo1(View view) {
        Intent in = new Intent(MainActivity.this, periodo1.class);
        startActivity(in);
    }

    public void periodo2(View view) {
        Intent in = new Intent(MainActivity.this, periodo2.class);
        startActivity(in);
    }

    public void futuro(View view) {
        Intent in = new Intent(MainActivity.this, futuro.class);
        startActivity(in);
    }
}