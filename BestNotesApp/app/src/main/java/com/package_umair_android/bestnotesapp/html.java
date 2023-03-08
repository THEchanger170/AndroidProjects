package com.package_umair_android.bestnotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class html extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView htmlVideo=findViewById(R.id.htmlvidlect);
        Button htmlWritten=findViewById(R.id.htmlwnlec);




        htmlVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(),videoWeb.class);
                intentMenu.putExtra("keyfile","https://www.google.com/");
                startActivity(intentMenu);
            }
        });
        htmlWritten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(),videoWeb.class);
                intentMenu.putExtra("keyfile","https://www.google.com/");
                startActivity(intentMenu);
            }
        });


    }
}