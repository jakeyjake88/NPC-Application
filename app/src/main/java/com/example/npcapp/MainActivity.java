package com.example.npcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.getStartedButton);
        addBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String name = (String) findViewById(R.id.userName).toString();
                String age = (String) findViewById(R.id.userAge).toString();
                UserInfo user = new UserInfo(name, age);
                openNPCMainPage(user);
            }
        });
    }
    public void openNPCMainPage(UserInfo user){
        Intent intent = new Intent(this, NPCActivity.class);
        startActivity(intent);
    }
}