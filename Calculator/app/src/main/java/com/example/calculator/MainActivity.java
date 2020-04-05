package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ADD;
    Button SUB;
    Button MUL;
    Button DIV;
    EditText Input_1;
    EditText Input_2;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ADD = findViewById(R.id.ADD);
        SUB = findViewById(R.id.SUB);
        MUL = findViewById(R.id.MUL);
        DIV = findViewById(R.id.DIV);


        Input_1 = findViewById(R.id.Value_1);
        Input_2 = findViewById(R.id.Value_2);
        Result = findViewById(R.id.result);

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c1 = Double.parseDouble(Input_1.getText().toString());
                double c2 = Double.parseDouble(Input_2.getText().toString());

                double res = c1 + c2;
                Result.setText(Double.toString(res));
            }
        });
        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c1 = Double.parseDouble(Input_1.getText().toString());
                double c2 = Double.parseDouble(Input_2.getText().toString());

                double res = c1 - c2;
                Result.setText(Double.toString(res));
            }
        });

        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c1 = Double.parseDouble(Input_1.getText().toString());
                double c2 = Double.parseDouble(Input_2.getText().toString());

                double res = c1 * c2;
                Result.setText(Double.toString(res));
            }
        });

        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double c1 = Double.parseDouble(Input_1.getText().toString());
                    double c2 = Double.parseDouble(Input_2.getText().toString());

                    double res = c1 / c2;
                    Result.setText(Double.toString(res));
                } catch (ArithmeticException e) {
                    Result.setText("ERR!");
                }

            }
        });
    }
}
