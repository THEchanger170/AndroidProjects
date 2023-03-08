package com.package_umair_android.islamictasbeehcounter;

import static com.package_umair_android.islamictasbeehcounter.R.id.unl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count;
     int limit;




 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text= findViewById(R.id.counter);
        ImageButton infinity=findViewById(R.id.btnInfinite);
        ImageButton reset=findViewById(R.id.btnReset);
        CheckBox limit33=findViewById(R.id.limit33);
        CheckBox limit34=findViewById(R.id.limit34);
        CheckBox limit100=findViewById(R.id.chkboxt);

     final Vibrator vibe = (Vibrator) MainActivity.this.getSystemService(Context.VIBRATOR_SERVICE);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CheckBox unl=findViewById(R.id.unl);

     final MediaPlayer mp = MediaPlayer.create(this, R.raw.gg);
        count=0;
        limit=0;

        infinity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
     infinity.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             if(limit33.isChecked()){
             if(limit==33 & count<33){
                 mp.start();
                 vibe.vibrate(50);
                 count++;
             }}
            else if(limit34.isChecked()){
              if (limit==34 & count <34 ){
                  mp.start();
                  vibe.vibrate(50);
                 count++;
             }}
            else if(limit100.isChecked()){
              if (limit==100 & count<100 ){mp.start();
                  vibe.vibrate(50);
                 count++;
             }}
             if(unl.isChecked()){
                 mp.start();
                 vibe.vibrate(50);

                 count++;}
             text.setText(""+count);
         }
     });
     reset.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             count=0;
             vibe.vibrate(90);
             text.setText(""+count);
         }
     });
     unl.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             text.setText(""+count);
         }
     });

        limit33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    limit=33;
                }


        });


limit34.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

            limit=34; }

});
limit100.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

            limit=100;}


});






    }
}