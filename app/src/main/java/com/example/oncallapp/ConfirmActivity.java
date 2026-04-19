package com.example.oncallapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmActivity extends AppCompatActivity {

    TextView textConfirmRole;
    TextView textConfirmPageType;
    Button buttonSendSMS;
    Button buttonSendEmail;
    Button buttonBackToHome;

    String selectedRole;
    String selectedPageType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        textConfirmRole = findViewById(R.id.textConfirmRole);
        textConfirmPageType = findViewById(R.id.textConfirmPageType);
        buttonSendSMS = findViewById(R.id.buttonSendSMS);
        buttonSendEmail = findViewById(R.id.buttonSendEmail);
        buttonBackToHome = findViewById(R.id.buttonBackToHome);

        selectedRole = getIntent().getStringExtra("selectedRole");
        selectedPageType = getIntent().getStringExtra("selectedPageType");

        textConfirmRole.setText("Role: " + selectedRole);
        textConfirmPageType.setText("Page Type: " + selectedPageType);

        buttonSendSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String smsMessage = selectedPageType + " page for " + selectedRole;

                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                smsIntent.setData(Uri.parse("smsto:"));
                smsIntent.putExtra("sms_body", smsMessage);

                try {
                    startActivity(smsIntent);
                } catch (Exception e) {
                    Toast.makeText(ConfirmActivity.this,
                            "SMS app not available.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailSubject = "On-Call Page Notification";
                String emailMessage = selectedPageType + " page for " + selectedRole;

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rfc822");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
                emailIntent.putExtra(Intent.EXTRA_TEXT, emailMessage);

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send Email"));
                } catch (Exception e) {
                    Toast.makeText(ConfirmActivity.this,
                            "Email app not available.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmActivity.this, DepartmentActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}