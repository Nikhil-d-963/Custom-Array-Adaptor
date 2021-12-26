package com.example.studentreportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Denver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proffeser);

        //Create an word list using array

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Name: Denver","Grade in Python: C","Grade in Java: C","Grade in Kotlin: C"));




        wordAdopter wrdAdapter = new wordAdopter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(wrdAdapter);
    }
}