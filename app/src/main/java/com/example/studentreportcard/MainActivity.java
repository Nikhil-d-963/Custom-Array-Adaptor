package com.example.studentreportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ///Proffeser Report card intent
        TextView student1 = findViewById(R.id.student01);
        student1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proffeserIntent = new Intent(getApplicationContext(), Proffeser.class);
                startActivity(proffeserIntent);
            }
        });


        //Helsinsi report card intent
        TextView student2 = findViewById(R.id.student02);
        student2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helsinkiIntent = new Intent(getApplicationContext(), Helsinki.class);
                startActivity(helsinkiIntent);
            }
        });



        //Rio report card intent
        TextView student3 = findViewById(R.id.student03);
        student3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rioIntent = new Intent(getApplicationContext(), Rio.class);
                startActivity(rioIntent);
            }
        });



        //Nairobi report card intent
        TextView student4 = findViewById(R.id.student04);
        student4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nairobiIntent = new Intent(getApplicationContext(), Nairobi.class);
                startActivity(nairobiIntent);
            }
        });



        //Brilin report card intent
        TextView student5 = findViewById(R.id.student05);
        student5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent brilinIntent = new Intent(getApplicationContext(), Brillin.class);
                startActivity(brilinIntent);
            }
        });


        //Denver report card intent
        TextView student6 = findViewById(R.id.student06);
        student6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent denverIntent = new Intent(getApplicationContext(), Denver.class);
                startActivity(denverIntent);
            }
        });





    }
}