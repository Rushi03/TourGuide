package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rushi Patel on 7/24/2016.
 */
public class WordAdapter extends ArrayAdapter<Word>
{

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int mColorId;

    //Create the public constructor for the custom ArrayAdapter class
    public WordAdapter(Activity context, ArrayList<Word> areas, int colorId)
    {
        super(context, 0, areas);
        mColorId = colorId;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate
                    (R.layout.list_item, parent, false);
        }

        //Create a new object of the custom class that receives the current info
        Word currentWord = getItem(position);

        //Find the view of the top text and set the view to the current text
        TextView attraction = (TextView) listItemView.findViewById(R.id.attraction);
        attraction.setText(currentWord.getAttraction());

        //Find the view of the bottom text and set the view to the current text
        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentWord.getLocation());

        //Find view for the image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        //Control flow of image
        if(currentWord.hasImageId())
        {
            iconView.setImageResource(currentWord.getImageResourceId());
        }
        else
        {
            iconView.setVisibility(View.GONE);
        }

        //Find view for the text area
        View containerView = listItemView.findViewById(R.id.container_view);
        //Get the the color for the background
        int colorBackground = ContextCompat.getColor(getContext(), mColorId);
        //Set the background color to match the main screen color
        containerView.setBackgroundColor(colorBackground);

        return listItemView;
    }

}
