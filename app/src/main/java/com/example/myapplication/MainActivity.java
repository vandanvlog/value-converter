package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button, button1 , button2, button3, button4, button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.idEdt);
        button = findViewById(R.id.idGram);
        button1 = findViewById(R.id.idKilomiter);
        button2 = findViewById(R.id.idMicrCentimiter);
        button3 = findViewById(R.id.idPound);
        button4 = findViewById(R.id.idMicrogram);
        button5 = findViewById(R.id.idMeter);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg ;
                Toast.makeText(MainActivity.this, "your pound value is " + pound, Toast.LENGTH_SHORT).show();
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double meter = Integer.parseInt(s);
                double kilometer = meter / 1000.0;
                Toast.makeText(MainActivity.this, "your kilometer valu is "+kilometer+"km", Toast.LENGTH_SHORT).show();


            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double kilometer = Integer.parseInt(s);
                double meter =  kilometer * 1000 ;
                Toast.makeText(MainActivity.this, "your meter value is "+meter+"m", Toast.LENGTH_SHORT).show();
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double kg = Integer.parseInt(s);
                double gram = kg * 1000 ;
                Toast.makeText(MainActivity.this, "so you gram value is "+gram+"g", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double kilometer = Integer.parseInt(s);
                double centimreter = kilometer * 100000 ;
                Toast.makeText(MainActivity.this, "your centimeter value is "+centimreter+"cm", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double kg = Integer.parseInt(s);
                double micormeter = kg * 1000000000 ;
                Toast.makeText(MainActivity.this, "your microgram value is "+micormeter+"mc", Toast.LENGTH_SHORT).show();
            }
        });





    }
}