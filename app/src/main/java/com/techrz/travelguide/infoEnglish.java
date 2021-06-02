package com.techrz.travelguide;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class infoEnglish extends AppCompatActivity {
    MyDatabaseHealper myDatabaseHealper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_english);

        myDatabaseHealper = new MyDatabaseHealper(this);
        SQLiteDatabase sqLiteDatabase = myDatabaseHealper.getWritableDatabase();

      //  String s= myDatabaseHealper.displayDataDescriptionCox();


        TextView t= findViewById(R.id.textView8);
       // t.setText(s);
        ImageView i = findViewById(R.id.imageView);

        //i.setImageDrawable(getResources().getDrawable(R.drawable.coxsex));



    }


}
