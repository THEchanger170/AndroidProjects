package com.package_umair_android.famouslifechangingquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView eintien=findViewById(R.id.eintienquotes);
        ImageView abraham=findViewById(R.id.abraham);
        ImageView washington=findViewById(R.id.washington);
//        SearchView search=findViewById(R.id.searchView);
//        ListView list=findViewById(R.id.listview);


        eintien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(),EngAlbertEintienQuotes.class);
                startActivity(intentMenu);
            }
        });
        abraham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(),AbrahamLincoin.class);
                startActivity(intentMenu);
            }
        });
        washington.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(),GeorgeWashington.class);
                startActivity(intentMenu);
            }
        });
    }
}