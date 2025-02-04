package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button openActivityTwo;
    Intent intent;
    SharedPreferences mainSharedPreference;
    SharedPreferences.Editor mainSharedPreferenceEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.main_textview);

        intent = new Intent(MainActivity.this, SecondActivity.class);           //
                                                                                             //
        openActivityTwo = findViewById(R.id.activity_two_button);                            //
        openActivityTwo.setOnClickListener(new View.OnClickListener() {                      //
            @Override                                                                        // Används för att öppna activity_second
            public void onClick(View v) {                                                    //
                onTapp();                                                                    //
            }                                                                                //
        });                                                                                  //
    }

    @Override
    public void onResume() {

        super.onResume();

        mainSharedPreference = getSharedPreferences("Preferences", MODE_PRIVATE);
        mainSharedPreferenceEditor = mainSharedPreference.edit();

        textView.setText(mainSharedPreference.getString("text_from_edittext", "nothing written here.."));

    }

    private void onTapp() {
        startActivity(intent);       // aktiverar intenten som öppnar activity_second
    }
}
