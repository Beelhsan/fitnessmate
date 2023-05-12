package com.example.fitnessmate;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fitnessmate.ui.theme.Calories;

public class CalorieListAdapter extends ArrayAdapter<Calories> {

    private Context mContext;
    private int mResource;

    public CalorieListAdapter(Context context, int resource, List<Calories> calories) {
        super(context, resource, calories);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
        }

        TextView foodNameTextView = convertView.findViewById(R.id.food_name);
        TextView calorieCountTextView = convertView.findViewById(R.id.calorie_count);
        TextView dateTextView = convertView.findViewById(R.id.date);

        Calories calories = getItem(position);

        foodNameTextView.setText(calories.getFoodName());
        calorieCountTextView.setText(String.valueOf(calories.getCalorieCount()));
        dateTextView.setText(calories.getDate());

        return convertView;
    }
}
