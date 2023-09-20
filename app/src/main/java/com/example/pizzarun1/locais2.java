package com.example.pizzarun1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class locais2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locais2);
    }

    public void locais3(View view) {
        Intent in = new Intent(locais2.this, locais3.class);
        startActivity(in);
    }

    public void locais2(View view) {
        Intent in = new Intent(locais2.this, locais.class);
        startActivity(in);
    }
}