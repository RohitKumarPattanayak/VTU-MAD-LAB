package com.example.lab_6_parser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xml_button(View view) {
      Intent i =  new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("mode",1);
        startActivity(i);
    }

    public void jason_button(View view) {
        Intent i =  new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("mode",2);
        startActivity(i);
    }
}