package com.example.android.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.um_qies_list, container, false);
        //define array list
        final ArrayList<UmQies> umQies = new ArrayList<UmQies>();

        //initialize elements in an array
        umQies.add(new UmQies(getString(R.string.مطعم_shine_cottage), getString(R.string.مفتوح_حتى_الساعه_الثانيه_صباحا), R.drawable.shine_cottage));
        umQies.add(new UmQies(getString(R.string.مقهى_ومطعم_ملتقى_أم_قيس), getString(R.string.مفتوح_على_مدار_24_ساعه), R.drawable.um_qies_cofee_and_resturants));
        umQies.add(new UmQies(getString(R.string.umm_Qies_Rest_House), getString(R.string.مفتوح_على_مدار_24_ساعه), R.drawable.umm_qais_rest_house));

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