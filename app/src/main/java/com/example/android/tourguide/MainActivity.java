package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the public places category view
        TextView publicPlaces = (TextView) findViewById(R.id.public_places);
        //Set the onClickListener to the the view
        publicPlaces.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesIntent);
            }
        });

        //Find the parks category view
        TextView parks = (TextView) findViewById(R.id.parks);
        //Set the onClickListener to the view
        parks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent parkIntent = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parkIntent);
            }
        });

        //Find the restaurants category view
        TextView museums = (TextView) findViewById(R.id.museums);
        //Set the onClickListener to the view
        museums.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent restaurantIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(restaurantIntent);
            }
        });

        //Find the events category view
        TextView events = (TextView) findViewById(R.id.events);
        //Set the onClickListener to the view
        events.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent eventIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(eventIntent);
            }
        });
    }
}
