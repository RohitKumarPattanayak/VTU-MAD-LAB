package com.example.lab3sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2Login extends AppCompatActivity {

    EditText SUser,SPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_login);
        SUser = findViewById(R.id.Login_User_name);
        SPass = findViewById(R.id.login_Password);
        Bundle b1 = getIntent().getExtras();


    }

    public void Login(View view) {
        Bundle b1 = getIntent().getExtras();
        String name = b1.getString("RUsername");
        String pwd = b1.getString("RPassword");
        String sUsername = SUser.getText().toString();
        String sPassword = SPass.getText().toString();
        if(sUsername.equals(name) && sPassword.equals(pwd) ){
            Toast.makeText(MainActivity2Login.this,"sucess",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity2Login.this,"failure",Toast.LENGTH_SHORT).show();
        }

    }
}