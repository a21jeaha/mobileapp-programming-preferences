package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    private SharedPreferences mySharedPreferenceRef;                    // shared preference object skaoad
    private SharedPreferences.Editor mySharedPreferenceEditor;          //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.second_activity_text);
        editText = findViewById(R.id.test_edit_demo);
        textView.setText(editText.getText().toString());      ////// FINISH UPP THIS PROCESS

        mySharedPreferenceRef = getPreferences(MODE_PRIVATE);           // shared preference initierad
        mySharedPreferenceEditor = mySharedPreferenceRef.edit();        //

    }
}