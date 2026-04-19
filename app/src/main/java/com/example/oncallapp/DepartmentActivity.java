package com.example.oncallapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DepartmentActivity extends AppCompatActivity {

    Button buttonCT;
    Button buttonCathLab;
    Button buttonRadiologist;
    Button buttonSupervisor;
    Button buttonBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        buttonCT = findViewById(R.id.buttonCT);
        buttonCathLab = findViewById(R.id.buttonCathLab);
        buttonRadiologist = findViewById(R.id.buttonRadiologist);
        buttonSupervisor = findViewById(R.id.buttonSupervisor);
        buttonBackToLogin = findViewById(R.id.buttonBackToLogin);

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

        buttonBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void openPageTypeScreen(String role) {
        Intent intent = new Intent(DepartmentActivity.this, PageTypeActivity.class);
        intent.putExtra("selectedRole", role);
        startActivity(intent);
    }
}