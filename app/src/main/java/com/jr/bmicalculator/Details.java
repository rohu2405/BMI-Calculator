package com.jr.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        String age = intent.getExtras().getString("age");
        String weight = intent.getExtras().getString("weight");
        String height = intent.getExtras().getString("height");
        TextView nameText = findViewById(R.id.name_output);
        TextView ageText = findViewById(R.id.age_output);
        TextView weightText = findViewById(R.id.weight_output);
        TextView heightText = findViewById(R.id.height_output);
        nameText.setText("Hey " + name);
        ageText.setText("Your age is " + age);
        weightText.setText("Your Weight is " + weight + " kg");
        heightText.setText("Your height is " + height + " cm");



        // calculating bmi
        float w = Float.parseFloat(weight);
        float h = Float.parseFloat(height)/100;
        float calBmi = w/(h*h);
        float roundOff = Math.round(calBmi*100)/100;
        String statement;
        if (roundOff>=16 && roundOff<=19) {
            statement = "UnderWeight";
        }
        else if(roundOff>=20 && roundOff<=25) {
            statement = "Normal";

        }
        else if(roundOff>=26 && roundOff<=40) {
            statement = "overwieght";
        }
        else {
            statement = "Invalid";
        }
        TextView bmi = findViewById(R.id.calculatedbmi);
        bmi.setText("Your bmi is " + roundOff + " " + statement);

    }
}