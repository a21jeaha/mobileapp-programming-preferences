package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    private SharedPreferences mySharedPreferenceRef;                    // shared preference object skaoad
    private SharedPreferences.Editor mySharedPreferenceEditor;          //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mySharedPreferenceRef = getPreferences(MODE_PRIVATE);           // shared preference initierad
        mySharedPreferenceEditor = mySharedPreferenceRef.edit();        //

    }
}