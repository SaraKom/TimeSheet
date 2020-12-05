package com.example.timesheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NAME = "KEY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText  userName;
        userName = (EditText) findViewById(R.id.userName);
        Button btnSubmit;
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(view -> {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), MainActivity2.class);

            i.putExtra(KEY_NAME,
                    userName.getText().toString());

            startActivity(i);
        });
    }
}