package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rushi Patel on 7/24/2016.
 */
public class PlacesActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        //Create ArrayList with custom class
        final ArrayList<Word> areas = new ArrayList<>();
        //Add specific info to list
        areas.add(new Word(getString(R.string.empire_state), getString(R.string.midtown), R.drawable.ic_empire_state));
        areas.add(new Word(getString(R.string.statue_of_liberty), getString(R.string.liberty), R.drawable.ic_statue));
        areas.add(new Word(getString(R.string.ground_zero), getString(R.string.financial), R.drawable.ic_ground_zero));
        areas.add(new Word(getString(R.string.photography), getString(R.string.theater), R.drawable.ic_photo_center));

        //Create an object of the custom ArrayAdapter class
        WordAdapter adapter = new WordAdapter(this, areas, R.color.publicColor);
        //Find the view of the category
        ListView listView = (ListView) findViewById(R.id.list);
        //Set the view with the custom ArrayAdapter
        listView.setAdapter(adapter);
    }

}
