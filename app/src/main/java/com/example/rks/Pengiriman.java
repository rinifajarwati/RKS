package com.example.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pengiriman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengiriman);
    }
    public void pengirim(View view) {
        Intent intent = new Intent(Pengiriman.this, Pilih.class);
        startActivity(intent);
    }
}