package com.example.toshiba.gettingedittextdatainsecondactivityontextviewwithtoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("data"));

        Toast.makeText(getApplicationContext(), "Welcome to Second Activity", Toast.LENGTH_SHORT).show();
    }
}
