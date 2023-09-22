package com.example.atravesdotempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class periodo1 extends AppCompatActivity {

    private Button botaoWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodo1);

        botaoWeb = (Button) findViewById(R.id.button_site);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9a3I0XwKQf0")));
            }
        });
    }

    public void MainActivity(View view) {
        Intent in = new Intent(periodo1.this, MainActivity.class);
        startActivity(in);
    }
}