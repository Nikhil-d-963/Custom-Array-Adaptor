package com.example.studentreportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Rio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proffeser);

        //Create an word list using array
        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Name: Rio","Grade in Python: F","Grade in Java: F","Grade in Kotlin: F"));



        //Set a Words into custom array adopter
        wordAdopter wrdAdapter = new wordAdopter(this, words);

        //Set a ListView to list.xml
        ListView listView = findViewById(R.id.list);
        //set array adopter into ListView
        listView.setAdapter(wrdAdapter);
    }
}