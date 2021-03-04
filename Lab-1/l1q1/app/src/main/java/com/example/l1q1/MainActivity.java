package com.example.l1q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t = (EditText) findViewById(R.id.et_Username);
        t.setGravity(Gravity.CENTER);
        EditText t1 = (EditText) findViewById(R.id.et_Password);
        t1.setGravity(Gravity.CENTER);
        EditText t2 = (EditText) findViewById(R.id.et_mobileNum);
        t2.setGravity(Gravity.CENTER);
        Button mButton = (Button) findViewById(R.id.bt_SignIn);
        mButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                     Log.v("EditText", t.getText().toString());
                     String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                     Log.v("emailValidation", Boolean.toString((t.getText().toString().matches(regex))));

                    }
                }
        );
    }


}

