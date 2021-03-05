package com.example.l1q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        EditText simpleEditText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText simpleEditText2 = (EditText) findViewById(R.id.editTextTextEmailAddress3);
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String mobilePattern = "[0-9]+";

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if(simpleEditText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter e-Mail!",Toast.LENGTH_SHORT).show();
                }else {
                    if (simpleEditText.getText().toString().trim().matches(emailPattern)) {
                        Toast.makeText(getApplicationContext(),"Valid e-Mail",Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(),"Invalid e-Mail!", Toast.LENGTH_SHORT).show();
                    }
                }
                if(simpleEditText2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Mobile Number!",Toast.LENGTH_SHORT).show();
                }else {
                    if (simpleEditText2.getText().toString().trim().matches(mobilePattern) && simpleEditText2.length()==10) {
                        Toast.makeText(getApplicationContext(),"Valid Mobile Number",Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(),"Invalid Mobile Number!", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),"Kindly check " + simpleEditText.getText() + " for further communication", Toast.LENGTH_SHORT).show();
            }

        });
    }
}