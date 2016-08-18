package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rushi Patel on 7/24/2016.
 */
public class EventsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        //Create an ArrayList with the custom class
        final ArrayList<Word> areas = new ArrayList<>();
        //Add the specific info to the list
        areas.add(new Word(getString(R.string.citifield), getString(R.string.shea_stadium)));
        areas.add(new Word(getString(R.string.barclays_center), getString(R.string.prospect_heights)));
        areas.add(new Word(getString(R.string.tribeca_film), getString(R.string.tribeca)));
        areas.add(new Word(getString(R.string.opera), getString(R.string.upper_west)));
        areas.add(new Word(getString(R.string.river_festival), getString(R.string.financial)));

        //Create an object of the custom ArrayAdapter
        WordAdapter adapter = new WordAdapter(this, areas, R.color.eventsColor);
        //Find the view of the category
        ListView listView = (ListView) findViewById(R.id.list);
        //Set the view to the custom ArrayAdapter
        listView.setAdapter(adapter);
    }
}
