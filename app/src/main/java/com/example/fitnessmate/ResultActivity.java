package com.example.fitnessmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Get the result from the previous activity
        Intent intent = getIntent();
        int calorieIntake = intent.getIntExtra("calorieIntake", 0);

        // Display the result
        TextView resultTextView = findViewById(R.id.result_text_view);
        resultTextView.setText(String.format(Locale.getDefault(), "Your daily calorie intake is %d", calorieIntake));

        // Set up the button to go back to the input activity
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, EnterInfoActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
