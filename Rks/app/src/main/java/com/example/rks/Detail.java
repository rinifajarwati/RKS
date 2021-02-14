package com.example.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
    public void detail(View view) {
        Intent intent = new Intent(Detail.this, Checkout.class);
        startActivity(intent);
    }
}