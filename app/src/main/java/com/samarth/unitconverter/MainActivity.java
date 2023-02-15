package com.samarth.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input = findViewById(R.id.enterNumber);
    TextView output = findViewById(R.id.textView);
    Button convert = findViewById(R.id.button);

    public void convert(View view){
        output.setText( input.getText() );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}