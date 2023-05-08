package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class DasborActivity extends AppCompatActivity {

    private ImageView ivMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasbor);

        ivMenu = findViewById(R.id.iv_Menu);

        ivMenu.setOnClickListener(V -> {
            Intent intent = new Intent(DasborActivity.this, MenuActivity.class);
            startActivity(intent);
            finish();
        });
    }
}