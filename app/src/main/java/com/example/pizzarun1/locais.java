package com.example.pizzarun1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class locais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locais);
    }


    public void MainActivity(View view) {
        Intent in = new Intent(locais.this, MainActivity.class);
        startActivity(in);
    }

    public void locais2(View view) {
        Intent in = new Intent(locais.this, locais2.class);
        startActivity(in);
    }
}