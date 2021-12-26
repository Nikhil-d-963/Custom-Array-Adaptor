package com.example.studentreportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Nairobi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proffeser);

        //Create an word list using array

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Name: Nairobi","Grade in Python: E","Grade in Java: E","Grade in Kotlin: E"));
        wordAdopter wrdAdapter = new wordAdopter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(wrdAdapter);
    }
}