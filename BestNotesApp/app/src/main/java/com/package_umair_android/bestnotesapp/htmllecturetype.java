package com.package_umair_android.bestnotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class htmllecturetype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmllecturetype);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView webdev=findViewById(R.id.written);



        webdev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(),videoWeb.class);
                startActivity(intentMenu);
            }
        });

    }
}