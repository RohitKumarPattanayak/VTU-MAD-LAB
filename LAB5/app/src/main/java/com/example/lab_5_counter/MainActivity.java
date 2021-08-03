package com.example.lab_5_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    TextView Counter_value;
    EditText Counter_stop_value;
    Handler handler = new Handler();
    int count = -1;
    int stopit;
    boolean running = false;

    void startThread(){
        counterthread a =  new counterthread();
        a.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Counter_value = findViewById(R.id.counter_value);
        Counter_stop_value = findViewById(R.id.counter_stop_value);
    }

    public void start_counter(View view) {
        count = -1;
        running =  true ;
        startThread();
    }

    public void stop_counter(View view) {
        running = false;
    }

    public void submit_counter(View view) {
        if(Counter_stop_value.getText().toString().isEmpty()){
            stopit = 0 ;
        }else {
            stopit = Integer.parseInt(Counter_stop_value.getText().toString());
            Toast.makeText(this, "Stop-time is set.", Toast.LENGTH_SHORT).show();
        }
    }

    public void clear_counter(View view) {
        stopit = 0 ;
        count = 0 ;
        Counter_value.setText("0");
        Counter_stop_value.setText("");
    }

    class counterthread extends Thread {
        @Override
        public void run() {
            if (stopit != 0) {
                for(int i =0;i<= stopit ; i++){
                    //for(int i = 0; i < 9 ; i++){
                    count++;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Counter_value.setText("" + count + "");
                            if(count == stopit){
                                Toast.makeText(MainActivity.this, "stop time reached.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else{
                while (running) {
                    //for(int i = 0; i < 9 ; i++){
                    count++;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Counter_value.setText("" + count + "");
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
        }
    }
}