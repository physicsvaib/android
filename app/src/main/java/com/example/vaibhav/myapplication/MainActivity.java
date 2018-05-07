package com.example.vaibhav.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        EditText e1 = (EditText)findViewById(R.id.editText2);
        EditText e2 = (EditText)findViewById(R.id.editText3);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));
    }
    public void div(View v){
        EditText e1 = (EditText)findViewById(R.id.editText2);
        EditText e2 = (EditText)findViewById(R.id.editText3);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        float num1 = Float.parseFloat(e1.getText().toString());
        float num2 = Float.parseFloat(e2.getText().toString());
        float sum = num1 / num2;
        t1.setText(Float.toString(sum));
    }
    public void mul(View v){
        EditText e1 = (EditText)findViewById(R.id.editText2);
        EditText e2 = (EditText)findViewById(R.id.editText3);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 * num2;
        t1.setText(Integer.toString(sum));
    }
    public void sub(View v){
        EditText e1 = (EditText)findViewById(R.id.editText2);
        EditText e2 = (EditText)findViewById(R.id.editText3);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 - num2;
        t1.setText(Integer.toString(sum));
    }
}
