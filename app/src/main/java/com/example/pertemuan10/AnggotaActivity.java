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

    public void btnAfsha(View view) {
        Intent intent = new Intent(AnggotaActivity.this, ProfileActivity.class);
        intent.putExtra(ProfileActivity.EXTRA_NIM, "18523047");
        startActivity(intent);
    }


    public void btnMahes(View view) {
        Intent intent = new Intent(AnggotaActivity.this, ProfileActivity.class);
        intent.putExtra(ProfileActivity.EXTRA_NIM, "18523200");
        startActivity(intent);
    }

    public void btnFira(View view) {
        Intent intent = new Intent(AnggotaActivity.this, ProfileActivity.class);
        intent.putExtra(ProfileActivity.EXTRA_NIM, "18523175");
        startActivity(intent);
    }

    public void btnBilly(View view) {
        Intent intent = new Intent(AnggotaActivity.this, ProfileActivity.class);
        intent.putExtra(ProfileActivity.EXTRA_NIM, "18523239");
        startActivity(intent);
    }

    public void btnHaydar(View view) {
        Intent intent = new Intent(AnggotaActivity.this, ProfileActivity.class);
        intent.putExtra(ProfileActivity.EXTRA_NIM, "18523241");
        startActivity(intent);
    }
}