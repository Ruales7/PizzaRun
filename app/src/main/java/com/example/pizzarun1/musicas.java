package com.example.pizzarun1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class musicas extends AppCompatActivity {


    private Button botaoWeb;
    private Button botaoWeb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_musicas);
        botaoWeb = (Button) findViewById(R.id.button_site);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sSswo1j5bCE ")));
            }
        });

        setContentView(R.layout.activity_musicas);
        botaoWeb2 = (Button) findViewById(R.id.button_site2);

        botaoWeb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLEGWXxQHuVpqOP3YR4KQOkCNMweUEzzJf")));
            }
        });
    }

    public void MainActivity(View view) {
        Intent in = new Intent(musicas.this, MainActivity.class);
        startActivity(in);
    }
}