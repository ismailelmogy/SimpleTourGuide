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
 * Created by ismail on 21/01/18.
 */

public class HospitalFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        final ArrayList<ItemData> items = new ArrayList<>();

        items.add(new ItemData(getString(R.string.makkah_specialized_hospital), getString(R.string.elnozha_street_elnakhl)
                , R.drawable.hospital_icon));
        items.add(new ItemData(getString(R.string.central_sinbillawain_hospital), getString(R.string.hospital_street)
                , R.drawable.hospital_icon));
        items.add(new ItemData(getString(R.string.center_of_the_heart), getString(R.string.the_land_of_the_barber)
                , R.drawable.hospital_icon));
        items.add(new ItemData(getString(R.string.elsafa_center_for_physiotherapy), getString(R.string.the_land_of_the_barber),
                R.drawable.hospital_icon));
        items.add(new ItemData(getString(R.string.al_shifa_charity_center), getString(R.string.el_istiklal_street_of_mostafa_kamal_st),
                R.drawable.hospital_icon));
        items.add(new ItemData(getString(R.string.attia_center_for_physiotherapy), getString(R.string.the_land_of_the_barber)
                , R.drawable.hospital_icon));
        items.add(new ItemData(getString(R.string.life_center_for_physiotherapy), getString(R.string.the_land_of_the_barber),
                R.drawable.hospital_icon));
        items.add(new ItemData(getString(R.string.sinbillawain_comprehensive_clinic), getString(R.string.land_of_beauty),
                R.drawable.hospital_icon));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemAdapter);

        return rootView;

    }
}
