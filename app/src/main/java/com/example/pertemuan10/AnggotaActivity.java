package com.example.pertemuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnggotaActivity extends AppCompatActivity {
    public static String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggota);
        this.setTitle(getIntent().getStringExtra(EXTRA_NAME));
    }

    public void btnFadel(View view) {
        Intent intent = new Intent(AnggotaActivity.this, ProfileActivity.class);
        intent.putExtra(ProfileActivity.EXTRA_NIM, "18523048");
        startActivity(intent);
    }

}