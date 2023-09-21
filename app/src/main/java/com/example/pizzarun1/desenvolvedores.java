package com.example.pizzarun1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class desenvolvedores extends AppCompatActivity {

    private Button botaoWeb;
    private Button botaoWeb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desenvolvedores);
        botaoWeb = (Button) findViewById(R.id.button_site);
        botaoWeb2 = (Button) findViewById(R.id.button_site2);
        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Ruales7")));
            }
        });
        botaoWeb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/danilodhog")));
            }
        });
    }

    public void MainActivity(View view) {
        Intent in = new Intent(desenvolvedores.this, MainActivity.class);
        startActivity(in);
    }
}