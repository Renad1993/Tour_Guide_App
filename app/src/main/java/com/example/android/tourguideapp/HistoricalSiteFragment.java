package com.example.android.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HistoricalSiteFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.um_qies_list, container, false);
        //define array list
        final ArrayList<UmQies> umQies = new ArrayList<UmQies>();

        //initialize elements in an array
        umQies.add(new UmQies(getString(R.string.اثار_أم_قيس), getString(R.string.مفتوح_على_مدار_24_ساعه), R.drawable.athar_um_qies));
        umQies.add(new UmQies(getString(R.string.المسرحين_الشمالي_والغربي_في_أم_قيس), getString(R.string.مفتوح_على_مدار_24_ساعه), R.drawable.masrh_um_qies));

        //make new umQiesAdapter object
        UmQiesAdapter adapter = new UmQiesAdapter(getActivity(), umQies);
        //find the listView by ID on rootView layout
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        //set the adapter on listView
        listView.setAdapter(adapter);
        //return the rootView layout
        return rootView;
    }
}