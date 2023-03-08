package com.package_umair_android.foodrestaurantmenucardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       ImageButton Menu=findViewById(R.id.burgercard);
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView burger=findViewById(R.id.nurger);
//        ImageButton SpecialOffer=findViewById(R.id.SpecialOffer);
//        ImageButton TodaysFood=findViewById(R.id.TodaysFood);
        Button burgerDetails=findViewById(R.id.btnDetailsburger);

        burgerDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Burger Menu Loading...",Toast.LENGTH_LONG).show();
                Intent intentMenu=new Intent(getApplicationContext(),offerActivity.class);
                startActivity(intentMenu);
            }
        });

//        burger.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"SpecialOffer",Toast.LENGTH_SHORT).show();
//                Intent intentSpecialOffer=new Intent(getApplicationContext(),offerActivity.class);
//                startActivity(intentSpecialOffer);
//            }
//        });
//        TodaysFood.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               Toast.makeText(getApplicationContext(),"TodaysFood",Toast.LENGTH_SHORT).show();
//               Intent intentTodaysFood=new Intent(getApplicationContext(),offerActivity.class);
//               startActivity(intentTodaysFood);
//            }
//        });


    }
}