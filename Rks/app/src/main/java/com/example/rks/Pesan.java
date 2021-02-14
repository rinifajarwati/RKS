package com.example.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pesan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
    }
    public void pesan(View view) {
        Intent intent = new Intent(Pesan.this, Bayar.class);
        startActivity(intent);
    }
}