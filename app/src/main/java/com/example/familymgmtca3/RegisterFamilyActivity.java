package com.example.familymgmtca3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterFamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_family);

        // Hides the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Button goToLandingPage = findViewById(R.id.go_to_landing_page_button);
        goToLandingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLpIntent = new Intent(RegisterFamilyActivity.this, MainActivity.class);
                startActivity(goToLpIntent);
            }
        });
    }
}