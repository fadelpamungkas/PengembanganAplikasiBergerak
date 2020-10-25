package com.example.pertemuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AnggotaActivity extends AppCompatActivity {
    public static String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggota);
        this.setTitle(getIntent().getStringExtra(EXTRA_NAME));
    }
}