package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private String operation;
    private Button send;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

        findViewById(R.id.Send).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            View resultx = ((View)findViewById(R.id.text_view));
        });
        send = findViewById(R.id.Send);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                //нажал на единицу
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                //нажал на двойку
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;

            case R.id.btn_three:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }

                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }

                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }

                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }

                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }

                break;

            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_minus:
                first = Integer.parseInt(textView.getText().toString());
                operation = "minus";

                break;
            case R.id.btn_plus:
                //нажали на плюс
                first = Integer.parseInt(textView.getText().toString());
                operation = "plus";
                break;
            case R.id.btn_multiplication:
                //нажали на плюс
                first = Integer.parseInt(textView.getText().toString());
                operation = "multiplication";
                break;
            case R.id.btn_divine:
                //нажали на плюс
                first = Integer.parseInt(textView.getText().toString());
                operation = "divine";
                break;
            case R.id.btn_equal:
                send.setVisibility(View.VISIBLE);
                second = Integer.parseInt(textView.getText().toString());
                Integer divine = first / second;
                Integer multiplication = first * second;
                Integer subtraction = first - second;
                Integer addiction = first + second;
                Integer[] result = {divine, multiplication, subtraction, addiction};
                //нажали на равно

                switch (operation) {
                    case "plus":
                        textView.setText(addiction.toString());
                        break;
                    case "minus":
                        textView.setText(subtraction.toString());
                        break;
                    case "multiplication":
                        textView.setText(multiplication.toString());
                        break;
                    case "divine":

                        textView.setText(divine.toString());

                        break;

                }
                break;
        }
        isOperationClick = true;

    }
}