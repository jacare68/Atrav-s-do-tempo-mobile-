package com.example.atravesdotempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class periodo2 extends AppCompatActivity {

    private Button botaoWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodo2);

        botaoWeb = (Button) findViewById(R.id.button_site2);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TNmwlPfSRR0")));
            }
        });
    }

    public void MainActivity(View view) {
        Intent in = new Intent(periodo2.this, MainActivity.class);
        startActivity(in);
    }
}