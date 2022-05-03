package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;                                          //
    private EditText editText;                                          // diverse widgets skapas
    private Button acceptTextButton;                                    //

    private SharedPreferences mySharedPreferenceRef;                    // shared preference object skaoad
    private SharedPreferences.Editor mySharedPreferenceEditor;          //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        acceptTextButton = findViewById(R.id.accept_text_Button);               // knappen kommer användas för att registrera text som skrivits i editText widgeten.
        acceptTextButton.setOnClickListener(new View.OnClickListener() {        //
            @Override
            public void onClick(View v) {
                onTappSecond();
            }
        });

        textView = findViewById(R.id.second_activity_text);
        editText = findViewById(R.id.test_edit_demo);


        mySharedPreferenceRef = getPreferences(MODE_PRIVATE);           // shared preference initierad
        mySharedPreferenceEditor = mySharedPreferenceRef.edit();        //

        textView.setText(mySharedPreferenceRef.getString("text_from_edittext","nothing written here.."));

    }

    private void onTappSecond(){
        textView.setText(editText.getText().toString());         // det som står skrivet i EditText widgeten skickas till textView och vissas upp
        mySharedPreferenceEditor.putString("text_from_edittext", textView.getText().toString());    // placerar String-värdert i en preference
        mySharedPreferenceEditor.apply();                                                           //
    }
}