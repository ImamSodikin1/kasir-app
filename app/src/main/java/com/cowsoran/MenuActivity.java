package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private TextView tvDasbor, tvProduk, tvPesanan, tvTransaksi, tvSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvDasbor = findViewById(R.id.tvDasbor);

        tvProduk  = findViewById(R.id.txt_produk);

        tvPesanan = findViewById(R.id.tvPesanan);

        tvTransaksi = findViewById(R.id.tvTransaki);

        tvSetting = findViewById(R.id.tvPengaturan);



        tvDasbor.setOnClickListener(V -> {
            Intent intent = new Intent(MenuActivity.this, DasborActivity.class);
            startActivity(intent);
            finish();
        });

        tvProduk.setOnClickListener(V -> {
            Intent intent = new Intent(MenuActivity.this, ProdukActivity.class);
            startActivity(intent);
            finish();
        });
    }
}