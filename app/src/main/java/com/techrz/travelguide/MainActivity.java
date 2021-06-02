package com.techrz.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String text=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp= findViewById(R.id.spinner);

        ArrayAdapter<String> adpt = new ArrayAdapter<String>(MainActivity.this, R.layout.spinner_item,getResources().getStringArray(R.array.Language));
        adpt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adpt);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    text="Bangla";
                }
                if(position==1){
                    text="English";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ImageButton b= findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text=="English")
                english();
                else if(text=="Bangla")
                    bangla();
            }
        });

    }


    void english(){
        Intent i= new Intent(this,English.class);
        startActivity(i);
    }
    void bangla(){
        Intent i= new Intent(this,Bangla.class);
        startActivity(i);
    }
}