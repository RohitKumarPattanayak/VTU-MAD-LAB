package com.example.lab2calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private Button bminiclear,badd, bsub, bdiv, bmul, bclear, bequals, bdecimal;
    private EditText Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button9);
        b5 = findViewById(R.id.button10);
        b6 = findViewById(R.id.button11);
        b7 = findViewById(R.id.button13);
        b8 = findViewById(R.id.button14);
        b9 = findViewById(R.id.button15);
        b0 = findViewById(R.id.button18);

        badd = findViewById(R.id.button4);
        bsub = findViewById(R.id.button12);
        bdiv = findViewById(R.id.button16);
        bmul = findViewById(R.id.button20);

        bclear = findViewById(R.id.button19);
        bminiclear = findViewById(R.id.button23);
        bdecimal = findViewById(R.id.button17);
        bequals = findViewById(R.id.button22);

        Display = findViewById(R.id.editTextTextPersonName);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("5");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("0");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("9");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("+");
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("-");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("/");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append("*");
            }
        });
        bdecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.append(".");
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Display.getText().length() > 0) {
                Display.setText("");
                }else{
                    Toast.makeText(MainActivity.this,"No inout!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bminiclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(Display.getText().length() > 0) {
                  CharSequence dis = Display.getText().toString();
                  Display.setText(dis.subSequence(0,Display.getText().length()-1));
              }else{
                  Toast.makeText(MainActivity.this,"No inout!!",Toast.LENGTH_SHORT).show();
              }
            }
        });
        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = Display.getText().toString();
                if(Display.getText().length() > 0)
                {
                if (data.contains("+")) {
                    String optr[] = data.split("\\+");
                    Double opr1 = Double.parseDouble(optr[0]);    //string to Double                                        converting from a String
                    Double opr2 = Double.parseDouble(optr[1]);
                    Double res = opr1 + opr2;
                    Display.setText(String.valueOf(res));
                }

                if (data.contains("-")) {
                    String optr[] = data.split("\\-");
                    Double opr1 = Double.parseDouble(optr[0]);
                    Double opr2 = Double.parseDouble(optr[1]);
                    Double res = opr1 - opr2;
                    Display.setText(Double.toString(res));       //(or) res.toString();      //(or) String.valueOf(res)     converting into String
                }

                if (data.contains("/")) {
                    String optr[] = data.split("\\/");
                    Double opr1 = Double.parseDouble(optr[0]);
                    Double opr2 = Double.parseDouble(optr[1]);
                    Double res = opr1 / opr2;
                    Display.setText(String.valueOf(res));
                }

                if (data.contains("*")) {
                    String optr[] = data.split("\\*");
                    Double opr1 = Double.parseDouble(optr[0]);
                    Double opr2 = Double.parseDouble(optr[1]);
                    Double res = opr1 * opr2;
                    Display.setText(String.valueOf(res));
                }

            }else{
                    Toast.makeText(MainActivity.this,"No vakues to operate!!",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
