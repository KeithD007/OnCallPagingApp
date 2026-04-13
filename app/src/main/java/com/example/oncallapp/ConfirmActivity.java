package com.example.oncallapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmActivity extends AppCompatActivity {

    TextView textConfirmRole;
    TextView textConfirmPageType;
    Button buttonSendPage;

    String selectedRole;
    String selectedPageType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        textConfirmRole = findViewById(R.id.textConfirmRole);
        textConfirmPageType = findViewById(R.id.textConfirmPageType);
        buttonSendPage = findViewById(R.id.buttonSendPage);

        selectedRole = getIntent().getStringExtra("selectedRole");
        selectedPageType = getIntent().getStringExtra("selectedPageType");

        textConfirmRole.setText("Role: " + selectedRole);
        textConfirmPageType.setText("Page Type: " + selectedPageType);

        buttonSendPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConfirmActivity.this,
                        selectedPageType + " page sent to " + selectedRole,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}