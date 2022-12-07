package com.example.familymgmtca3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hides the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Button goToLogin = findViewById(R.id.lp_login_button);
        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        Button goToRegisterFamily = findViewById(R.id.lp_register_button);
        goToRegisterFamily.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, RegisterFamilyActivity.class);
                startActivity(registerIntent);
            }
        }));

    }


}