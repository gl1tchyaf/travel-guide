package com.techrz.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;


public class Bangla extends AppCompatActivity {
    public static String place=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);
        ImageSlider imageSlider = findViewById(R.id.tranding);
        List<SlideModel> slideModels= new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.trandcox,"Cox-Bazar"));
        slideModels.add(new SlideModel(R.drawable.trandsaj,"Sajek"));
        slideModels.add(new SlideModel(R.drawable.trandsaint,"Saint Martin"));
        slideModels.add(new SlideModel(R.drawable.trandsylhet,"Sylhet"));
        imageSlider.setImageList(slideModels,true);

        ImageButton coxb= findViewById(R.id.coxbazar);
        ImageButton safari= findViewById(R.id.safariPark);
        ImageButton saintMartin=findViewById(R.id.saintMartin);
        Button allplaces= findViewById(R.id.allplaces);

        coxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                place="CoxBazar";
                coxBazar();
            }
        });
        safari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                place="Safari Park";
                safari();
            }
        });

        allplaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allplaces();
            }
        });

        saintMartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                place="SaintMartin";
                saintMartin();
            }
        });

    }


    public void coxBazar(){
        Intent intent= new Intent(this,coxBangla.class);
        startActivity(intent);
    }

    public void safari(){
        Intent intent= new Intent(this,safariBangla.class);
        startActivity(intent);
    }

    public void allplaces(){
        Intent intent=new Intent(this,allplaces.class);
        startActivity(intent);
    }

    public void saintMartin(){
        Intent intent=new Intent(this,SaintMartinBangla.class);
        startActivity(intent);
    }

}