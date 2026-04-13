package com.example.oncallapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonCT;
    Button buttonCathLab;
    Button buttonRadiologist;
    Button buttonSupervisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCT = findViewById(R.id.buttonCT);
        buttonCathLab = findViewById(R.id.buttonCathLab);
        buttonRadiologist = findViewById(R.id.buttonRadiologist);
        buttonSupervisor = findViewById(R.id.buttonSupervisor);

        buttonCT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPageTypeScreen("CT Technologist");
            }
        });

        buttonCathLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPageTypeScreen("Cath Lab Team");
            }
        });

        buttonRadiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPageTypeScreen("Radiologist");
            }
        });

        buttonSupervisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPageTypeScreen("Supervisor");
            }
        });
    }

    public void openPageTypeScreen(String role) {
        Intent intent = new Intent(MainActivity.this, PageTypeActivity.class);
        intent.putExtra("selectedRole", role);
        startActivity(intent);
    }
}