package com.example.android.tourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    //constructor that contain context of the app argument and the fragmentManager argument
    public CategoryAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //switch between fragment based on position of each fragment and return this fragment
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GardensFragment();
        } else if (position == 1) {
            return new HistoricalSiteFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    //return the number of fragment
    @Override
    public int getCount() {
        return 4;
    }

    //return the title of each fragment based on position of the fragment
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_gardens);
        } else if (position == 1) {
            return mContext.getString(R.string.category_historical_site);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museums);
        } else {
            return mContext.getString(R.string.category_restaurants);
        }
    }

}
