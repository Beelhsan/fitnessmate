package com.example.fitnessmate.ui.theme.;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessmate.R;

public class CalorieActivity extends AppCompatActivity {

    private EditText mAgeEditText;
    private EditText mHeightEditText;
    private EditText mWeightEditText;
    private Button mCalculateButton;
    private TextView mCalorieTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_intake_calculator);

        mAgeEditText = findViewById(R.id.editText_age);
        mHeightEditText = findViewById(R.id.editText_height);
        mWeightEditText = findViewById(R.id.editText_weight);
        mCalculateButton = findViewById(R.id.button_calculate);
        mCalorieTextView = findViewById(R.id.textView_calorie);

        mCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age = Integer.parseInt(mAgeEditText.getText().toString());
                int height = Integer.parseInt(mHeightEditText.getText().toString());
                int weight = Integer.parseInt(mWeightEditText.getText().toString());
                // formule de calorie
                int calorieIntake = (int) (10 * weight + 6.25 * height - 5 * age + 5);

                mCalorieTextView.setText(getString(R.string.calorie, calorie));
            }
        });
    }
}
