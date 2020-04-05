package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner color;
    TextView brands;
    Button find_beer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color = (Spinner) findViewById(R.id.color);
        brands = (TextView) findViewById(R.id.brands);
        find_beer = (Button) findViewById(R.id.find_beer);
        find_beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brands.setText(String.valueOf(color.getSelectedItem()));
            }
        });
    }
}
