package com.example.lab_7_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText enteredcontent;
    TextToSpeech t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enteredcontent = findViewById(R.id.speack_content);
        t = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    t.setLanguage(Locale.ENGLISH);
                }else{
                    Log.e("FAILED", "onInit: FAILED");
                }
            }
        });

    }

    public void speech(View view) {
        String s = enteredcontent.getText().toString();
        t.speak(s,TextToSpeech.QUEUE_FLUSH,null);
    }
}