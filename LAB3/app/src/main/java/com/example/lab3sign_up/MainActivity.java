package com.example.lab3sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText UserN;
    EditText UserP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserN = findViewById(R.id.Sign_up_User_name);
        UserP = findViewById(R.id.Sign_up_Password);



    }

    public void Signup_button(View view) {
        String Username = UserN.getText().toString();
        String Password = UserP.getText().toString();

        if(Username.isEmpty() || Password.isEmpty() ){
            Toast.makeText(MainActivity.this,"Fill all fiels",Toast.LENGTH_SHORT).show();
        }else{
            Bundle b = new Bundle();
            b.putString("RUsername",Username);
            b.putString("RPassword",Password);
            Intent i = new Intent(MainActivity.this,MainActivity2Login.class);
            i.putExtras(b);
            startActivity(i);

        }

    }
}