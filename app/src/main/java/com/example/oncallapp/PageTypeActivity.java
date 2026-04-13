package com.example.oncallapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageTypeActivity extends AppCompatActivity {

    TextView textRoleSelected;
    Button buttonRoutine;
    Button buttonUrgent;
    Button buttonEmergency;

    String selectedRole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_type);

        textRoleSelected = findViewById(R.id.textRoleSelected);
        buttonRoutine = findViewById(R.id.buttonRoutine);
        buttonUrgent = findViewById(R.id.buttonUrgent);
        buttonEmergency = findViewById(R.id.buttonEmergency);

        selectedRole = getIntent().getStringExtra("selectedRole");

        textRoleSelected.setText("Selected Role: " + selectedRole);

        buttonRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConfirmationScreen("Routine");
            }
        });

        buttonUrgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConfirmationScreen("Urgent");
            }
        });

        buttonEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConfirmationScreen("Emergency");
            }
        });
    }

    public void openConfirmationScreen(String pageType) {
        Intent intent = new Intent(PageTypeActivity.this, ConfirmActivity.class);
        intent.putExtra("selectedRole", selectedRole);
        intent.putExtra("selectedPageType", pageType);
        startActivity(intent);
    }
}

