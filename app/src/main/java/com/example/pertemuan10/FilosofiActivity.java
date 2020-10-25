package com.example.pertemuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FilosofiActivity extends AppCompatActivity {
    public static String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filosofi);
        this.setTitle(getIntent().getStringExtra(EXTRA_NAME));
    }
}