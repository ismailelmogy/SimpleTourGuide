package com.example.ismail.simpletourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ismail.tourguide.R;

/**
 * Created by ismail on 22/01/18.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new RestaurantFragment();
        else if (position == 1)
            return new HospitalFragment();
        else if (position == 2)
            return new PharmacyFragment();
        else
            return new SchoolFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.restaurants_category);
        else if (position == 1)
            return mContext.getString(R.string.hospitals_category);
        else if (position == 2)
            return mContext.getString(R.string.pharmacies_category);
        else
            return mContext.getString(R.string.schools_category);
    }
}
