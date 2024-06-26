package com.khair.homework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity10 extends AppCompatActivity {

    EditText inputNumber;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);



        inputNumber = findViewById(R.id.input_number);
        resultText = findViewById(R.id.result_text);


        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity10.super.onBackPressed();
            }
        });

        Button calculateButton = findViewById(R.id.calculate_button);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
            }
        });

    }
    ///////////===================================================================================

    private void calculate() {
        String input = inputNumber.getText().toString();
        if (input.isEmpty()) {
            inputNumber.setError("Please enter a number");
            return;
        }

        int n = Integer.parseInt(input);
        StringBuilder resultBuilder = new StringBuilder();
        int sumOfSquares = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            sumOfSquares += square;
            resultBuilder.append(i).append("*2 = ").append(square).append("\n");
        }

        resultBuilder.append("Sum of squares:= ").append(sumOfSquares);
        resultText.setText(resultBuilder.toString());
    }

 ////==============================================================================================
}