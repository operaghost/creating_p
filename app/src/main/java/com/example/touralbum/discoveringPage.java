package com.example.touralbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class discoveringPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discovering);

        ImageButton ibutn = findViewById(R.id.create_btn2);
        ibutn.setOnClickListener(v -> {
            Intent intent = new Intent(discoveringPage.this, creatingPage.class);
            startActivity(intent);
        });

    }
}