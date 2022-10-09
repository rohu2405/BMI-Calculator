package com.jr.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view) {
        EditText nameInput = findViewById(R.id.name_person);
        EditText ageInput = findViewById(R.id.age_person);
        EditText weightInput = findViewById(R.id.weight_person);
        EditText heightInput = findViewById(R.id.height_person);
        String nameText = nameInput.getText().toString();
        String ageText = ageInput.getText().toString();
        String weightText = weightInput.getText().toString();
        String heightText = heightInput.getText().toString();
        Intent intent = new Intent(MainActivity.this , Details.class);
        intent.putExtra("name" , nameText );
        intent.putExtra("age" , ageText);
        intent.putExtra("weight" , weightText);
        intent.putExtra("height" , heightText);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), " Opening Details" , Toast.LENGTH_SHORT);
        toast.show();

    }
}