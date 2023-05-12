package com.example.fitnessmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fitnessmate.ui.theme.Calories;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    List<Calories> calories = new ArrayList <>();

    mCalorieListView = findViewById(R.id.calorie_list_view);
    mAdapter = new CalorieListAdapter(this, R.layout.list_item_calorie, calories);
        mCalorieListView.setAdapter(mAdapter);
}
}

        }