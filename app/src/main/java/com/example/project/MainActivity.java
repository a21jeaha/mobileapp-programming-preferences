package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button openActivityTwo;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       intent = new Intent(MainActivity.this, SecondActivity.class);           //
                                                                                            //
       openActivityTwo = findViewById(R.id.activity_two_button);                            //
       openActivityTwo.setOnClickListener(new View.OnClickListener() {                      //
           @Override                                                                        // Används för att öppna activity_second
           public void onClick(View v) {
               onTapp();
           }                                        //
       });                                                                                  //
    }


    protected void onResume() {

        super.onResume();


    }

    private void onTapp() {
       startActivity(intent);       // aktiverar intenten som öppnar activity_second
    }
}
