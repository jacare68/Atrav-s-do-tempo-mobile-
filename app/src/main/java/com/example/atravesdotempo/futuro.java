package com.example.atravesdotempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class futuro extends AppCompatActivity {

    private Button botaoWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futuro);

        botaoWeb = (Button) findViewById(R.id.button_site3);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SZQdAFUHxRc")));
            }
        });
    }

    public void MainActivity(View view) {
        Intent in = new Intent(futuro.this, MainActivity.class);
        startActivity(in);
    }
}