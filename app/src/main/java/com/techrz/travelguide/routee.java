package com.techrz.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class routee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routee);

        Bangla b= new Bangla();

        MyDatabaseHealper myDatabaseHealper = new MyDatabaseHealper(this);
        SQLiteDatabase sqLiteDatabase = myDatabaseHealper.getWritableDatabase();

        String s= myDatabaseHealper.displayRoute_Bangla(b.place);
        TextView route=findViewById(R.id.route);
        route.setText(s);
    }
}