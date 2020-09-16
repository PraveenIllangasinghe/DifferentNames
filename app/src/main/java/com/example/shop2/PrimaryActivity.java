package com.example.shop2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PrimaryActivity extends AppCompatActivity {

    private int age = 23;
    private String nm = "Tom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
    }
}