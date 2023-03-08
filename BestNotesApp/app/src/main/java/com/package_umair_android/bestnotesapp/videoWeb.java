package com.package_umair_android.bestnotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class videoWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_web);

        Bundle extras=getIntent().getExtras();
        String path="https://www.google.com/";

        if (extras !=null){
            path=extras.getString("keyfile");
        }


       WebView myPage=findViewById(R.id.vidWeb);

       WebSettings myPageSettings=myPage.getSettings();
       myPage.loadUrl(path);

       myPageSettings.setUseWideViewPort(false);

    }
}
