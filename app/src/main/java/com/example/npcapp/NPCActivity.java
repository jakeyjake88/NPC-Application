package com.example.npcapp;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.npcapp.databinding.ActivityNpcactivityBinding;

public class NPCActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npcactivity);

        Button mathyBtn = (Button) findViewById(R.id.mathyStartButton);
        mathyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openMathyActivity();
            }
        });

    }

    public void openMathyActivity(){
        Intent intent = new Intent(this, MathyActivity.class);
        startActivity(intent);
    }
}