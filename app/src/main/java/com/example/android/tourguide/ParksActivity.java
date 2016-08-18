package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rushi Patel on 7/24/2016.
 */
public class ParksActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        //Create an ArraList with the custom class
        final ArrayList<Word> areas = new ArrayList<>();
        //Add the specific info into the list
        areas.add(new Word(getString(R.string.central_park), getString(R.string.san_juan_hill), R.drawable.ic_central));
        areas.add(new Word(getString(R.string.high_line), getString(R.string.chelsea), R.drawable.ic_high_line));
        areas.add(new Word(getString(R.string.bb_park), getString(R.string.dumbo), R.drawable.ic_brooklyn_bridge));
        areas.add(new Word(getString(R.string.prospect), getString(R.string.park_slope), R.drawable.ic_prospect));

        //Create an object of the custom ArrayAdapter
        WordAdapter adapter = new WordAdapter(this, areas, R.color.parksColor);
        //Find the view of the category
        ListView listView = (ListView) findViewById(R.id.list);
        //Set the view to the custom ArrayAdapter
        listView.setAdapter(adapter);
    }
}
