package com.example.laba11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    boolean button1Pressed;
    boolean button2Pressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b1.setOnClickListener(click1);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(click2);
    }

    View.OnClickListener click1 = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (!button1Pressed){
                button2Pressed = false;
                button1Pressed = true;
                Toast.makeText(MainActivity.this, "Леванян", Toast.LENGTH_SHORT).show();
            }
        }
    };
    View.OnClickListener click2 = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (!button2Pressed) {
                button1Pressed = false;
                button2Pressed = true;
                Toast.makeText(MainActivity.this, "Леванян", Toast.LENGTH_SHORT).show();
            }
        }
    };
}