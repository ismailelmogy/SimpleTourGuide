package com.example.ismail.simpletourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ismail.tourguide.R;

import java.util.ArrayList;

/**
 * Created by ismail on 20/01/18.
 */

public class ItemAdapter extends ArrayAdapter<ItemData> {

    public ItemAdapter(Context context, ArrayList<ItemData> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item
                    , parent, false);
        }

        ItemData currentItem = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentItem.getmTitleName());

        TextView locationTextView = listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentItem.getmLocation());

        ImageView imageView = listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentItem.getmImageResourceId());

        return listItemView;
    }
}
