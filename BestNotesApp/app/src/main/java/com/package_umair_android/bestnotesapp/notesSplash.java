package com.package_umair_android.bestnotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class notesSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                Intent iHome=new Intent(notesSplash.this,MainActivity.class);
                Intent iHomem=new Intent (notesSplash.this,MainActivity.class);
                startActivity(iHomem);
                finish();
            }
        }, 2000);
    }
}