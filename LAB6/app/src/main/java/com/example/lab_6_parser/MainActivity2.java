package com.example.lab_6_parser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity2 extends AppCompatActivity {

    String s;
    TextView jsonparser;
    TextView xmlparser;
    TextView xmlTitle;
    TextView jasonTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        jsonparser = findViewById(R.id.jasonPlaceholder);
        xmlparser = findViewById(R.id.xmlPlaceholder);
        xmlTitle = findViewById(R.id.XML_Title);
        jasonTitle = findViewById(R.id.JSON_Title);
        /*if(getIntent().getIntExtra("mode",0) == 1){
            parseXML();
        }*/
        if(getIntent().getIntExtra("mode",0) == 2){
            parseJSON();
        }
    }

    public void parseJSON(){
        try {
            InputStream i = getAssets().open("input.json");
            int size = i.available();
            byte[] buffer = new byte[size];
            i.read(buffer);
            s = new String(buffer);
            JSONObject j = new JSONObject(s);
            JSONObject city = j.getJSONObject("City");
            String City = city.getString("City-Name");
            String Latitude = city.getString("Latitude");
            String Longitude = city.getString("Longitude");
            String Temperature = city.getString("Temperature");
            String Humidity = city.getString("Humidity");
            jsonparser.setText(City+"\n");
            jsonparser.append(Latitude+"\n");
            jsonparser.append(Longitude+"\n");
            jsonparser.append(Temperature+"\n");
            jsonparser.append(Humidity+"\n");

            xmlparser.setText("City name :"+"\n");
            xmlparser.append("Latitude :"+"\n");
            xmlparser.append("Longitude :"+"\n");
            xmlparser.append("Temperature :"+"\n");
            xmlparser.append("Humidity  :"+"\n");
            xmlTitle.setText("");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}