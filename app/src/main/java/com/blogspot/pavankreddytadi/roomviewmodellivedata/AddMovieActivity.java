package com.blogspot.pavankreddytadi.roomviewmodellivedata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//Created by PAVAN for Training APSSDC Mentors and Students

public class AddMovieActivity extends AppCompatActivity
{

    EditText title,desc,poster_path,vote_average;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movies);
        
        desc = findViewById(R.id.over_view);
        title = findViewById(R.id.movie_id);
        poster_path = findViewById(R.id.poster_path);
        vote_average = findViewById(R.id.vote_average);
    }

    public void addToDatabase(View view)
    {
        //TODO: Implement Code to Write Data to Room DATABASE
    }

}

