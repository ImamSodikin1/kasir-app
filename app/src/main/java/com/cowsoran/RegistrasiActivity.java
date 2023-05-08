package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class RegistrasiActivity extends AppCompatActivity {

    ImageView img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        img_back = findViewById(R.id.img_back_regis);
        img_back.setOnClickListener(V -> {
            Intent intent  = new Intent(RegistrasiActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}