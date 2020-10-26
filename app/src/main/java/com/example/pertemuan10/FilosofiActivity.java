package com.example.pertemuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FilosofiActivity extends AppCompatActivity implements View.OnClickListener {
    public static String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filosofi);
        this.setTitle(getIntent().getStringExtra(EXTRA_NAME));

        Button web = (Button)findViewById(R.id.btnWeb);

        web.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, "https://id.wikipedia.org/wiki/Alam_semesta");
        startActivity(intent);
    }
}