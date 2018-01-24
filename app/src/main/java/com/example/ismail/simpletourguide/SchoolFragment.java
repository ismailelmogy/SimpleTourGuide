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
 * Created by ismail on 22/01/18.
 */

public class SchoolFragment extends Fragment {

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        final ArrayList<ItemData> items = new ArrayList<>();
        items.add(new ItemData(getString(R.string.ahmed_lotfy_high_school),
                getString(R.string.schools_street_next_to_the_railway_station),
                R.drawable.school_icon));
        items.add(new ItemData(getString(R.string.ibn_elwalid_school), getString(R.string.elmadares_street)
                , R.drawable.school_icon));
        items.add(new ItemData(getString(R.string.alburjas_school), getString(R.string.borgas_street),
                R.drawable.school_icon));
        items.add(new ItemData(getString(R.string.albustan_school), getString(R.string.elbastan_street)
                , R.drawable.school_icon));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), items);

        listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemAdapter);


        return rootView;

    }

}
