package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText firstValorEditText;
    EditText secondValorEditText;
    EditText resultEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        firstValorEditText = findViewById(R.id.firstValorEditText);
        secondValorEditText = findViewById(R.id.secondValorEditText);
        resultEditText = findViewById(R.id.resultEditText);
    }

    protected float getNumFromEditText(int id)
    {
        String aux;
        if(id == 1)
        {
            aux = firstValorEditText.getText().toString();
        }else
        {
            aux = secondValorEditText.getText().toString();
        }
        return Float.parseFloat(aux);
    }


    public void plusButtonOnClick(View v)
    {
        float num1 = getNumFromEditText(1);
        float num2 = getNumFromEditText(2);
        float result = num1 + num2;

        resultEditText.setText(String.valueOf(result));
    }

    public void minusButtonOnClick(View v)
    {
        float num1 = getNumFromEditText(1);
        float num2 = getNumFromEditText(2);
        float result = num1 - num2;

        resultEditText.setText(String.valueOf(result));
    }

    public void multiButtonOnClick(View v)
    {
        float num1 = getNumFromEditText(1);
        float num2 = getNumFromEditText(2);
        float result = num1 * num2;

        resultEditText.setText(String.valueOf(result));
    }

    public void divButtonOnClick(View v)
    {
        float num1 = getNumFromEditText(1);
        float num2 = getNumFromEditText(2);
        float result = num1 / num2;

        resultEditText.setText(String.valueOf(result));
    }


}