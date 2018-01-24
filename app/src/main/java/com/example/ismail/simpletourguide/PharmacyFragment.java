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

public class PharmacyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        final ArrayList<ItemData> items = new ArrayList<>();
        items.add(new ItemData(getString(R.string.walid_tarshobi_pharmacy), getString(R.string.ahmed_abdel_aziz_street)
                , R.drawable.pharmacy_icon));
        items.add(new ItemData(getString(R.string.alikhlas_pharmacy), getString(R.string.abdel_moneim_street),
                R.drawable.pharmacy_icon));
        items.add(new ItemData(getString(R.string.elamal_pharmacy), getString(R.string.ahmed_abdel_aziz_street)
                , R.drawable.pharmacy_icon));
        items.add(new ItemData(getString(R.string.eleman_pharmacy), getString(R.string.saad_zaghloul_street),
                R.drawable.pharmacy_icon));
        items.add(new ItemData(getString(R.string.elhorreya_pharmacy), getString(R.string.foda_street),
                R.drawable.pharmacy_icon));
        items.add(new ItemData(getString(R.string.elhayat_pharmacy), getString(R.string.salah_salem_street),
                R.drawable.pharmacy_icon));


        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemAdapter);

        return rootView;

    }
}
