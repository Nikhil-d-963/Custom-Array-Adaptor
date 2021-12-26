package com.example.studentreportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Proffeser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proffeser);

        //Create an word list using array
        ArrayList<word> words = new ArrayList<word>();


        //just a examples for list of items
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));
        words.add(new word("Name: Proffeser","Grade in Python: A","Grade in Java: A","Grade in Kotlin: A"));


        //Set a Words into custom array adopter
        wordAdopter wrdAdapter = new wordAdopter(this, words);

        //Set a ListView to list.xml
        ListView listView = findViewById(R.id.list);

        //set array adopter into ListView
        listView.setAdapter(wrdAdapter);
    }

}