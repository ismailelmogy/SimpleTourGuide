package com.example.ismail.simpletourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ismail.tourguide.R;

import java.util.ArrayList;

/**
 * Created by ismail on 20/01/18.
 */

public class RestaurantFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        final ArrayList<ItemData> items = new ArrayList<>();
        items.add(new ItemData(getString(R.string.elmahalla_sons_restaurant), getString(R.string.ahmed_abdel_aziz_street), R.drawable.restaurant_icon));
        items.add(new ItemData(getString(R.string.abou_laila_restaurant), getString(R.string.amran_tower_beside_amran_pharmacy), R.drawable.restaurant_icon));
        items.add(new ItemData(getString(R.string.cat_restaurant), getString(R.string.the_treaty_street), R.drawable.restaurant_icon));
        items.add(new ItemData(getString(R.string.almahalla_restaurant), getString(R.string.sabry_abou_alam_street_inside_railway_mall), R.drawable.restaurant_icon));
        items.add(new ItemData(getString(R.string.kebab_house_restaurant), getString(R.string.the_treaty_street), R.drawable.restaurant_icon));
        items.add(new ItemData(getString(R.string.felfla_restaurant), getString(R.string.qantara_square), R.drawable.restaurant_icon));
        items.add(new ItemData(getString(R.string.costa_restaurant), getString(R.string.the_treaty_street), R.drawable.restaurant_icon));


        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);


        listView.setAdapter(itemAdapter);

        return rootView;

    }


}
