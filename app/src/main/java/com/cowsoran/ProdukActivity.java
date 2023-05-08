package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ProdukActivity extends AppCompatActivity {

    private ImageView ivMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);

        ivMenu = findViewById(R.id.iv_MenuProduk);

        ivMenu.setOnClickListener(V -> {
            Intent intent  = new Intent(ProdukActivity.this, MenuActivity.class);
            startActivity(intent);
            finish();
        });
    }
}