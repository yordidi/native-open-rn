package com.nativeopenrn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonOpenRN = (Button) findViewById(R.id.button_open_main);
        buttonOpenRN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("extrData", "settings");
                startActivity(intent);
            }
        });

        Button buttonOpenMyRN = (Button) findViewById(R.id.button_open_my_react);
        buttonOpenMyRN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MyReactActivity.class);
                startActivity(intent);
            }
        });

    }
}