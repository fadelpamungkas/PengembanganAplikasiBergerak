package com.example.pertemuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnFilosofi, btnAnggota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("UNIVERSE");

        btnFilosofi = (Button) findViewById(R.id.btnFilosofi);
        btnFilosofi.setOnClickListener(this);

        btnAnggota = (Button) findViewById(R.id.btnAnggota);
        btnAnggota.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnFilosofi:
                Intent filosofi = new Intent(MainActivity.this, FilosofiActivity.class);
                filosofi.putExtra(FilosofiActivity.EXTRA_NAME, "Filosofi UNIVERSE");
                startActivity(filosofi);
                break;

            case R.id.btnAnggota:
                Intent anggota = new Intent(MainActivity.this, AnggotaActivity.class);
                anggota.putExtra(AnggotaActivity.EXTRA_NAME, "Anggota UNIVERSE");
                startActivity(anggota);
                break;
        }
    }
}