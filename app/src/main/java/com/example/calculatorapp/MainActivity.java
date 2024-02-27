package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.calculatorapp.databinding.ActivityMainBinding;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

//    MaterialButton button0, button1, button2, button3, button4, button5, button6,
//            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
//            buttonMul, button10, buttonC, buttonEqual;
    EditText editText;
    float valueOne, valueTwo;
    boolean additionOperator, subtractOperator, multiplicationOperator, divisionOperator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        editText = (EditText) findViewById(R.id.editText);
//        button0 = (MaterialButton) findViewById(R.id.zero);
//        button1 = (MaterialButton) findViewById(R.id.one);
//        button2 = (MaterialButton) findViewById(R.id.two);
//        button3 = (MaterialButton) findViewById(R.id.three);
//        button4 = (MaterialButton) findViewById(R.id.four);
//        button5 = (MaterialButton) findViewById(R.id.five);
//        button6 = (MaterialButton) findViewById(R.id.six);
//        button7 = (MaterialButton) findViewById(R.id.seven);
//        button8 = (MaterialButton) findViewById(R.id.eghit);
//        button9 = (MaterialButton) findViewById(R.id.nine);
//        button10 = (MaterialButton) findViewById(R.id.dot);
//        buttonAdd = (MaterialButton) findViewById(R.id.plus_button);
//        buttonSub = (MaterialButton) findViewById(R.id.minus_button);
//        buttonMul = (MaterialButton) findViewById(R.id.multiply_operation);
//        buttonDivision = (MaterialButton) findViewById(R.id.division_button);
//        buttonC = (MaterialButton) findViewById(R.id.clear);
//        buttonEqual = (MaterialButton) findViewById(R.id.calculate_button);

        binding.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("1"));
            }
        });

        binding.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("2"));
            }
        });

        binding.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("3"));
            }
        });
        binding.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("4"));
            }
        });
        binding.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("5"));
            }
        });
        binding.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("6"));
            }
        });
        binding.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("7"));
            }
        });
        binding.eghit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().append("8"));
            }
        });
        binding.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        binding.plusButton.setOnClickListener(new View.OnClickListener() {
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

       binding.minusButton.setOnClickListener(new View.OnClickListener() {
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
        binding.multiplyOperation.setOnClickListener(new View.OnClickListener() {
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
        binding.divisionButton.setOnClickListener(new View.OnClickListener() {
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
        binding.calculateButton.setOnClickListener(new View.OnClickListener() {
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
        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        binding.dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

    }
}