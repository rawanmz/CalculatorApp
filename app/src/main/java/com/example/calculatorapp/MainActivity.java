package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText editText;
    float valueOne, valueTwo;
    boolean additionOperator, subtractOperator, multiplicationOperator, divisionOperator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button0 = (MaterialButton) findViewById(R.id.zero);
        button1 = (MaterialButton) findViewById(R.id.one);
        button2 = (MaterialButton) findViewById(R.id.two);
        button3 = (MaterialButton) findViewById(R.id.three);
        button4 = (MaterialButton) findViewById(R.id.four);
        button5 = (MaterialButton) findViewById(R.id.five);
        button6 = (MaterialButton) findViewById(R.id.six);
        button7 = (MaterialButton) findViewById(R.id.seven);
        button8 = (MaterialButton) findViewById(R.id.eghit);
        button9 = (MaterialButton) findViewById(R.id.nine);
        button10 = (MaterialButton) findViewById(R.id.dot);
        buttonAdd = (MaterialButton) findViewById(R.id.plus_button);
        buttonSub = (MaterialButton) findViewById(R.id.minus_button);
        buttonMul = (MaterialButton) findViewById(R.id.multiply_operation);
        buttonDivision = (MaterialButton) findViewById(R.id.division_button);
        buttonC = (MaterialButton) findViewById(R.id.clear);
        buttonEqual = (MaterialButton) findViewById(R.id.calculate_button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("1"));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("2"));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("3"));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("4"));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("5"));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("6"));
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("7"));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("8"));
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    additionOperator = true;
                    editText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    subtractOperator = true;
                    editText.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText().toString());
                    multiplicationOperator = true;
                    editText.setText(null);
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText().toString());
                    divisionOperator = true;
                    editText.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    editText.setText("");
                } else {
                    valueTwo = Float.parseFloat(editText.getText() + "");
                    if (additionOperator) {
                        editText.setText(valueOne + valueTwo + "");
                        additionOperator = false;
                    }
                    if (subtractOperator) {
                        editText.setText(valueOne - valueTwo + "");
                        subtractOperator = false;
                    }
                    if (multiplicationOperator == true) {
                        editText.setText(valueOne * valueTwo + "");
                        multiplicationOperator = false;
                    }
                    if (divisionOperator == true) {
                        editText.setText((valueOne / valueTwo) + "");
                        divisionOperator = false;
                    }
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

    }
}