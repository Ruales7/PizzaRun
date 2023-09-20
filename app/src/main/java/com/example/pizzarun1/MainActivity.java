package com.example.pizzarun1;

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

    public void historia(View view) {
        Intent in = new Intent(MainActivity.this, historia.class);
        startActivity(in);
    }

    public void mapa(View view) {
        Intent in = new Intent(MainActivity.this, mapa.class);
        startActivity(in);
    }

    public void locais(View view) {
        Intent in = new Intent(MainActivity.this, locais.class);
        startActivity(in);
    }

    public void eventos(View view) {
        Intent in = new Intent(MainActivity.this, eventos.class);
        startActivity(in);
    }

    public void musicas(View view) {
        Intent in = new Intent(MainActivity.this, musicas.class);
        startActivity(in);
    }


    public void desenvolvedores(View view) {
        Intent in = new Intent(MainActivity.this, desenvolvedores.class);
        startActivity(in);
    }
}