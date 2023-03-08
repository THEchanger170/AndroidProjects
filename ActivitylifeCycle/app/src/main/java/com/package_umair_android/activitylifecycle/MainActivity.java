package com.package_umair_android.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LogName", "On Create Activity started");
        Toast.makeText(this, "On Ctreate Activity started", Toast.LENGTH_LONG).show();
    }
    protected void onStart() {
        super.onStart();
        Log.i("LogName", "On Start Activity started");
        Toast.makeText(this, "On Start Activity started", Toast.LENGTH_LONG).show();
    }
    protected void onResume() {
        super.onResume();
        Log.i("LogName", "On ResumeActivity started");
        Toast.makeText(this, "On Resume Activity started", Toast.LENGTH_LONG).show();
    }
    protected void onPause() {
        super.onPause();
        Log.i("LogName", "On PAuse Activity started");
        Toast.makeText(this, "On Pause Activity started", Toast.LENGTH_LONG).show();
    }
    protected void onStop(){
        super.onStop();
        Log.i("LogName", "On Stop Activity started");
        Toast.makeText(this, "On Stop Activity started", Toast.LENGTH_LONG).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("LogName", "On Destroy Activity started");
        Toast.makeText(this, "On Destroy Activity started", Toast.LENGTH_LONG).show();
    }

}