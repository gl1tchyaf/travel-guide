package com.techrz.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class maplink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maplink);

        Bangla b= new Bangla();

        MyDatabaseHealper myDatabaseHealper = new MyDatabaseHealper(this);
        SQLiteDatabase sqLiteDatabase = myDatabaseHealper.getWritableDatabase();

        String s= myDatabaseHealper.mapLink_Bangla(b.place);
        TextView maplink=findViewById(R.id.maplink);
        maplink.setText(s);
    }
}