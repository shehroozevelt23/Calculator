package com.example.shehrooz.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button plusButton, minusButton, multiplyButton, divideButton, clearButton;
    EditText firstNumberEditText;
    Context context;
    EditText secondNumberEditText;
    TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusButton = findViewById(R.id.plus_button);
        minusButton = findViewById(R.id.minus_button);
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);
        clearButton = findViewById(R.id.clear_button);
        firstNumberEditText = findViewById(R.id.firstprompt);
        secondNumberEditText = findViewById(R.id.secondprompt);


        resultTextView = findViewById(R.id.resultvalue);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_number = firstNumberEditText.getText().toString();
                String second_number = secondNumberEditText.getText().toString();

                if (first_number.equals("") || second_number.equals("")){
                    Toast.makeText(MainActivity.this, "Enter both numbers first.",Toast.LENGTH_SHORT).show();
                }else{
                    Double answer = Double.parseDouble(first_number) + Double.parseDouble(second_number);
                    resultTextView.setText(Double.toString(answer));
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_number = firstNumberEditText.getText().toString();
                String second_number = secondNumberEditText.getText().toString();

                if (first_number.equals("") || second_number.equals("")){
                    Toast.makeText(MainActivity.this, "Enter both numbers first.",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Double answer = Double.parseDouble(first_number) - Double.parseDouble(second_number);
                    resultTextView.setText(Double.toString(answer));
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_number = firstNumberEditText.getText().toString();
                String second_number = secondNumberEditText.getText().toString();
                if (first_number.equals("") || second_number.equals("")){
                    Toast.makeText(MainActivity.this, "Enter both numbers first.",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Double answer = Double.parseDouble(first_number) * Double.parseDouble(second_number);
                    resultTextView.setText(Double.toString(answer));
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_number = firstNumberEditText.getText().toString();
                String second_number = secondNumberEditText.getText().toString();
                if (first_number.equals("") || second_number.equals("")){
                    Toast.makeText(MainActivity.this, "Enter both numbers first.",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Double answer = Double.parseDouble(first_number) / Double.parseDouble(second_number);
                    resultTextView.setText(Double.toString(answer));
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumberEditText.setText("");
                secondNumberEditText.setText("");
                resultTextView.setText("");
            }
        });
    }
}
