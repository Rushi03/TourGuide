package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rushi Patel on 7/24/2016.
 */
public class MuseumsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        //Create an ArrayList with the custom class
        final ArrayList<Word> areas = new ArrayList<>();
        //Add the specific info to the list
        areas.add(new Word(getString(R.string.morgan), getString(R.string.murray_hill)));
        areas.add(new Word(getString(R.string.city_ny), getString(R.string.central_park)));
        areas.add(new Word(getString(R.string.moving_image), getString(R.string.astoria)));
        areas.add(new Word(getString(R.string.wax_museum), getString(R.string.theater)));
        areas.add(new Word(getString(R.string.rubin_art), getString(R.string.chelsea)));

        //Create an object with the custom ArrayAdapter
        WordAdapter adapter = new WordAdapter(this, areas, R.color.museumsColor);
        //Find the view of the category
        ListView listView = (ListView) findViewById(R.id.list);
        //Set the view to the custom ArrayAdapter
        listView.setAdapter(adapter);
    }
}
