package com.techrz.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class safariBangla extends AppCompatActivity {
    MyDatabaseHealper myDatabaseHealper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safari_bangla);

        myDatabaseHealper = new MyDatabaseHealper(this);
        SQLiteDatabase sqLiteDatabase = myDatabaseHealper.getWritableDatabase();


        ImageSlider imageSlider = findViewById(R.id.coxbazar);
        List<SlideModel> slideModels= new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.safaria,""));
        slideModels.add(new SlideModel(R.drawable.safarib,""));

        imageSlider.setImageList(slideModels,true);

        Button route = findViewById(R.id.routeCox);
        Button Cost = findViewById(R.id.costCox);
        Button MapLink = findViewById(R.id.MapLinkCox);

        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                routeCox();

            }
        });


        Cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                costCox();

            }
        });

        MapLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapCox();

            }
        });

    }
    public void routeCox(){
        Intent intent= new Intent(this,routee.class);
        startActivity(intent);
    }
    public void costCox(){
        Intent intent= new Intent(this,cost.class);
        startActivity(intent);
    }
    public void mapCox(){
        Intent intent= new Intent(this,maplink.class);
        startActivity(intent);
    }

}