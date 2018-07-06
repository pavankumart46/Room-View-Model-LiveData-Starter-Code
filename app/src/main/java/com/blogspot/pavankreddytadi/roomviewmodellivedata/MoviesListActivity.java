package com.blogspot.pavankreddytadi.roomviewmodellivedata;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//Created by PAVAN for Training APSSDC Mentors and Students
public class MoviesListActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_list);
    }

    public void addMovie(View view)
    {
        startActivity(new Intent(this,AddMovieActivity.class));
    }


}
