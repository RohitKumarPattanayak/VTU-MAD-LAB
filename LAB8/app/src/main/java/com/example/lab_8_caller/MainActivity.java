package com.example.lab_8_caller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.dialed_number);
    }

    public void btn_1(View view) {
        number.append("1");
    }

    public void btn_2(View view) {
        number.append("2");
    }

    public void btn_3(View view) {
        number.append("3");
    }

    public void btn_4(View view) {
        number.append("4");
    }

    public void btn_5(View view) {
        number.append("5");
    }

    public void btn_6(View view) {
        number.append("6");
    }

    public void btn_7(View view) {
        number.append("7");
    }

    public void btn_8(View view) {
        number.append("8");
    }

    public void btn_9(View view) {
        number.append("9");
    }

    public void btn_0(View view) {
        number.append("0");
    }

    public void btn_star(View view) {
        number.append("*");
    }

    public void btn_hash(View view) {
        number.append("#");
    }

    public void btn_save(View view) {
        String s1 = number.getText().toString();
        Intent i1 = new Intent(ContactsContract.Intents.Insert.ACTION);
        i1.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        i1.putExtra(ContactsContract.Intents.Insert.NAME,"Unknown");
        i1.putExtra(ContactsContract.Intents.Insert.PHONE,s1);

        /*
        Uri u1= Uri.parse("tel:"+s1);
    i1.setData(u1)*/;
    startActivity(i1);
    }

    public void btn_call(View view) {
        Intent i  = new Intent();
        i.setAction(Intent.ACTION_CALL);
        String s = number.getText().toString();
        Uri u = Uri.parse("tel:"+s);
        i.setData(u);
        startActivity(i);
    }

    public void btn_clear(View view) {
        //number.setText("");
        String s2 = number.getText().toString();
        if(s2.length()>0){
        number.setText(s2.substring(0,s2.length()-1));
        }else{
            Log.e("NO INPUT", "Please input a number.");
        }
    }
}