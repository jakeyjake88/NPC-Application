package com.example.npcapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MathyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathy);
        Button calcBtn = (Button) findViewById(R.id.calculate_button);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText equation = (EditText) findViewById(R.id.equation_string);
                TextView resultText = (TextView) findViewById(R.id.result_equation);

                int numEquation = Integer.parseInt(equation.getText().toString());
                int result = 0;
                resultText.setText(result);
            }
        });
    }
}
