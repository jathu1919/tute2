package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button button;
    EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        no1.setText(getIntent().getExtras().getString("number1"));
        no2.setText(getIntent().getExtras().getString("number2"));

    }


    public void onButton_Add(View v){
        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        TextView textView = (TextView)findViewById(R.id.result);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float sum = (number1 + number2);

        textView.setText(Float.toString(number1)+" "+"+"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(sum));
    }



    public void onButton_Sub(View v){
        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        TextView textView = (TextView)findViewById(R.id.result);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float sub = (number1 - number2);

        textView.setText(Float.toString(number1)+" "+"-"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(sub));
    }



    public void onButton_Mul(View v){
        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        TextView textView = (TextView)findViewById(R.id.result);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float mul = (number1 * number2);

        textView.setText(Float.toString(number1)+" "+"x"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(mul));

    }



    public void onButton_Div(View v){
        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        TextView textView = (TextView)findViewById(R.id.result);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float div = number1/number2;

        textView.setText(Float.toString(number1)+" "+"/"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(div));

    }
}
