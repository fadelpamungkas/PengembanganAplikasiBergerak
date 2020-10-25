package com.example.pertemuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {
    public static String EXTRA_NIM = "extra_nim";

    private TextView tvNama, tvNim, tvAsal, tvTTL;
    private CircleImageView circleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvNama = (TextView) findViewById(R.id.tvNama);
        tvNim = (TextView) findViewById(R.id.tvNim);
        tvAsal = (TextView) findViewById(R.id.tvAsal);
        tvTTL = (TextView) findViewById(R.id.tvTTL);
        circleImageView = (CircleImageView) findViewById(R.id.circleImage);

        switch (Objects.requireNonNull(getIntent().getStringExtra(EXTRA_NIM))){
            case "18523048":
                tvNama.setText(R.string.fadel_nama);
                tvNim.setText(R.string.fadel_nim);
                tvAsal.setText(R.string.fadel_asal);
                tvTTL.setText(R.string.fadel_TTL);
                circleImageView.setImageDrawable(getResources().getDrawable(R.drawable.fadel));
                break;

            case "18523049":

        }
    }
}