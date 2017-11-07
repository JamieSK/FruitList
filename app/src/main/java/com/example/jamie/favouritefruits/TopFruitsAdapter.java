package com.example.jamie.favouritefruits;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamie on 07/11/2017.
 */

class TopFruitsAdapter extends ArrayAdapter<Fruit> {

  public TopFruitsAdapter(@NonNull Context context, @NonNull ArrayList<Fruit> fruits) {
    super(context, 0, fruits);
  }

  public View getView(int position, View convertView, ViewGroup parent) {
    if (convertView == null) {
      convertView = LayoutInflater.from(getContext()).inflate(R.layout.fruit_item, parent, false);
    }
    Fruit currentFruit = getItem(position);

    TextView rating = convertView.findViewById(R.id.ratingView);
    rating.setText(String.valueOf(currentFruit.getRating()));

    TextView name = convertView.findViewById(R.id.nameView);
    String nameString = currentFruit.getName();
    name.setText(nameString.substring(0, 1).toUpperCase() + nameString.substring(1));

    TextView weight = convertView.findViewById(R.id.weightView);
    weight.setText(String.valueOf(currentFruit.getWeight()) + "g");

    convertView.setTag(currentFruit);

    return convertView;
  }
}
