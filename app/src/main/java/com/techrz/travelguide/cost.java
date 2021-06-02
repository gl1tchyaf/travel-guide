package com.techrz.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class cost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost);

        Bangla b= new Bangla();

        MyDatabaseHealper myDatabaseHealper = new MyDatabaseHealper(this);
        SQLiteDatabase sqLiteDatabase = myDatabaseHealper.getWritableDatabase();

        String s= myDatabaseHealper.cost_Bangla(b.place);
        TextView cost=findViewById(R.id.cost);
        cost.setText(s);
    }
}