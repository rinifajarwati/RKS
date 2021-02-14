package com.example.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bayar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar);
    }
    public void bayar(View view) {
        Intent intent = new Intent(Bayar.this, Transfer.class);
        startActivity(intent);
    }
}