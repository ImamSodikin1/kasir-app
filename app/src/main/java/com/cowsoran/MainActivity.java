package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_regis, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.btn_login1);

        btn_regis = findViewById(R.id.btn_regis1);

        btn_login.setOnClickListener(V -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        btn_regis.setOnClickListener(V -> {
            Intent intent = new Intent(MainActivity.this, RegistrasiActivity.class);
            startActivity(intent);
            finish();
        });
    }
}