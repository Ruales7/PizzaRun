package com.example.pizzarun1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class eventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
    }

    public void MainActivity(View view) {
        Intent in = new Intent(eventos.this, MainActivity.class);
        startActivity(in);
    }

}