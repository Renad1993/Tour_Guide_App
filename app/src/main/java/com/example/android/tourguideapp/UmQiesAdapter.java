package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class UmQiesAdapter extends ArrayAdapter<UmQies> {

    public UmQiesAdapter(Activity context, ArrayList<UmQies> umQies) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, umQies);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link UmQies} object located at this position in the list
        UmQies currentUmQies = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_of_place
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name_of_place);
        // Get the place name from the current UmQies object and
        // set this text on the name TextView
        nameTextView.setText(currentUmQies.getmNameOfPlace());

        // Find the TextView in the list_item.xml layout with the ID work_time
        TextView workTimeTextView = (TextView) convertView.findViewById(R.id.work_time);
        // Get the work time from the current UmQies object and
        // set this text on the workTime TextView
        workTimeTextView.setText(currentUmQies.getmWorkTime());
        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);

        // If an image is available, display the provided image based on the resource ID
        imageView.setImageResource(currentUmQies.getmImageResourceId());
        //return the convertView
        return convertView;
    }
}
